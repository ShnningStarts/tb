package com.smart.cache;

import org.springframework.cache.Cache;
import org.springframework.data.redis.cache.RedisCache;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public class RedisAndLocalCache implements Cache {
    ConcurrentHashMap<Object,Object> local=new ConcurrentHashMap<Object, Object>();
    RedisCache redisCache;
    TwoLevelCacheManager cacheManager;
    public RedisAndLocalCache(TwoLevelCacheManager cacheManager,RedisCache redisCache){
        this.redisCache=redisCache;this.cacheManager=cacheManager;

    }

    @Override
    public ValueWrapper putIfAbsent(Object o, Object o1) {
        return null;
    }


    @Override
    public String getName() {
        return redisCache.getName();
    }

    @Override
    public Object getNativeCache() {
        return redisCache.getNativeCache();
    }

    @Override
    public <T> T get(Object o, Class<T> aClass) {
        return null;
    }

    @Override
    public <T> T get(Object o, Callable<T> callable) {
        return null;
    }


    @Override
    public ValueWrapper get(Object o) {
        ValueWrapper wrapper=(ValueWrapper)local.get(o);
        if (wrapper !=null){
            return wrapper;
        }
        else {
            wrapper=redisCache.get(o);
            if (wrapper !=null){
                local.put(o, wrapper);
            }
        }
        return wrapper;
    }

    @Override
    public void put(Object key, Object value) {
        redisCache.put(key, value);
        clear();
    }

    @Override
    public void evict(Object o) {
        redisCache.evict(o);
    }

    @Override
    public void clear() {

    }
}
