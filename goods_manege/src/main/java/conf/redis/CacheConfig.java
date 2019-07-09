package conf.redis;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;

import java.io.UnsupportedEncodingException;
import java.time.Duration;

@Configuration
@AutoConfigureAfter(RedisAutoConfiguration.class)
@ConditionalOnBean(RedisTemplate.class)
@ConditionalOnMissingBean(CacheManager.class)
public class CacheConfig {
    RedisTemplate redisTemplate;

@Bean()
    public TwoLevelCacheManage cacheConfiguration(RedisTemplate redisTemplate){
    RedisCacheWriter writer=new RedisCacheWriter().
    ObjectMapper objectMap=new ObjectMapper();
    objectMap.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
    objectMap.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
    Jackson2JsonRedisSerializer jsonRedisSerializer=new Jackson2JsonRedisSerializer(Object.class);
    jsonRedisSerializer.setObjectMapper(objectMap);
    RedisSerializationContext.SerializationPair pair= RedisSerializationContext.SerializationPair.fromSerializer(jsonRedisSerializer);

    RedisCacheConfiguration cacheConfiguration=RedisCacheConfiguration.defaultCacheConfig().serializeValuesWith(pair).entryTtl(Duration.ofSeconds(60));
    TwoLevelCacheManage twoLevelCacheManage =new TwoLevelCacheManage(cacheConfiguration,writer,redisTemplate);
    return twoLevelCacheManage;
}
@Value("${springext.cache.redis.topic}")
    String topicName;
@Bean
    RedisMessageListenerContainer listenerContainer(RedisConnectionFactory connectionFactory, MessageListenerAdapter listenerAdapter){
    RedisMessageListenerContainer container=new RedisMessageListenerContainer();
    container.setConnectionFactory(connectionFactory);
    container.addMessageListener(listenerAdapter, new PatternTopic(topicName));
    return container;
}
@Bean
    MessageListenerAdapter listenerAdapter(final TwoLevelCacheManage cacheManage){
    return new MessageListenerAdapter(new MessageListener(){
        @Override
        public void onMessage(Message message, byte[] pattern) {
            byte[] bs=message.getChannel();
            try {
                String type=new String(bs,"UTF-8");
                cacheManage.receiver(type);

            }catch (UnsupportedEncodingException e){
                e.printStackTrace();
            }
        }
    }
    );
}

}
