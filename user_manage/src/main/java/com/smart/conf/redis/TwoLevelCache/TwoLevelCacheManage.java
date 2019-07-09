package com.smart.conf.redis.TwoLevelCache;

import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;
import org.springframework.cache.Cache;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

public class TwoLevelCacheManage extends RedisCacheManager {
    RedisTemplate redisTemplate;
    String topicName;
    TwoLevelCacheManage( RedisCacheConfiguration redisCacheConfiguration, RedisCacheWriter cacheWriter, RedisTemplate redisTemplate){
        super(cacheWriter,redisCacheConfiguration);
        this.redisTemplate=redisTemplate;



    }
    @Override
    protected Cache decorateCache(Cache cache) {
        return super.decorateCache(cache);
    }
public void pushlishMessage(String cacheName){
        this.redisTemplate.convertAndSend(topicName,cacheName);
}
public void receiver(String name){
RedisAndLocalCache cache=(RedisAndLocalCache)this.getCache(name);
if (cache!=null){
    cache.clearLocal();
}
}


}
