package com.smart.cache;

import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.core.RedisTemplate;

import java.security.PublicKey;

class TwoLevelCacheManager extends RedisCacheManager {
    RedisTemplate redisTemplate;
    public TwoLevelCacheManager(RedisTemplate redisTemplate, RedisCacheWriter cacheWriter, RedisCacheConfiguration redisCacheConfiguration){
        super(cacheWriter,redisCacheConfiguration);
        this.redisTemplate=redisTemplate;
    }
}
