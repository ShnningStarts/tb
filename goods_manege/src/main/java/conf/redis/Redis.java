package conf.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class Redis {
    @Autowired
    private TwoLevelCacheManage  redisTemplate=new CacheConfig().cacheConfiguration(new RedisTemplate());

}
