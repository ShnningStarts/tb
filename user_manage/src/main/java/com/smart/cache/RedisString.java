package com.smart.cache;

import org.springframework.data.redis.core.BoundListOperations;
import org.springframework.data.redis.core.StringRedisTemplate;

public class RedisString {
    private StringRedisTemplate redisTemplate;
    BoundListOperations operations=redisTemplate.boundListOps("");
    


}
