package com.smart.conf.redis.TwoLevelCache;

import org.springframework.cache.Cache;
import org.springframework.data.redis.cache.RedisCache;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public class RedisAndLocalCache implements Cache {
    ConcurrentHashMap<Object,Object> local=new ConcurrentHashMap<Object, Object>();
    RedisCache redisCache;
    TwoLevelCacheManage twoLevelCacheManage;
    public RedisAndLocalCache(TwoLevelCacheManage cache, RedisCache redisCache){
        this.redisCache=redisCache;
        this.twoLevelCacheManage =cache;
    }

    @Override
    public Object getNativeCache() {
        return redisCache.getNativeCache();
    }

    @Override
    public ValueWrapper get(Object o) {
       ValueWrapper wrapperr=(ValueWrapper)local.get(o);
       if (wrapperr!=null){
           return wrapperr;
       }
       else {
           wrapperr=redisCache.get(o);
           if (wrapperr!=null)
           local.put(o, wrapperr);
       }
       return wrapperr;
    }


    @Override
    public String getName() {
        return redisCache.getName();
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
    public void put(Object o, Object o1) {
        redisCache.put(o, o1);
        clearOtherJVM();

    }

    @Override
    public ValueWrapper putIfAbsent(Object o, Object o1) {
        return null;
    }

    @Override
    public void evict(Object o) {
        redisCache.evict(o);
        clearOtherJVM();
    }

    @Override
    public void clear() {

    }
    protected void clearOtherJVM(){
        twoLevelCacheManage.pushlishMessage(redisCache.getName());
    }
    public void clearLocal(){
        this.local.clear();
    }
}
