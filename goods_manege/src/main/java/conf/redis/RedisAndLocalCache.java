package conf.redis;

import org.springframework.cache.Cache;
import org.springframework.data.redis.cache.RedisCache;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public class RedisAndLocalCache implements Cache {
    ConcurrentHashMap<Object,Object> local=new ConcurrentHashMap<Object, Object>();
    RedisCache redisCache;
    TwoLevelCacheManage cacheManage;
    public RedisAndLocalCache(TwoLevelCacheManage cacheManage,RedisCache redisCache){
        this.redisCache=redisCache;
        this.cacheManage=cacheManage;
    }

    public String getName() {
        return redisCache.getName();
    }

    public Object getNativeCache() {
        return redisCache.getNativeCache();
    }

    public <T> T get(Object key, Callable<T> valueLoader) {
        return null;
    }

    public <T> T get(Object key, Class<T> type) {
        return null;
    }

    public ValueWrapper get(Object key) {
        ValueWrapper wrapper = (ValueWrapper) local.get(key);
        if (wrapper != null) {
            return wrapper;
        } else {
            wrapper = redisCache.get(key);
            if ((wrapper != null)) {
                local.put(key, wrapper);

            }
        }
        return wrapper;
    }
    public void put(Object key, Object value) {
System.out.println(value.getClass().getName());
redisCache.put(key, value);
clear();;
    }

    public ValueWrapper putIfAbsent(Object key, Object value) {
        return null;
    }

    public void evict(Object key) {
redisCache.evict(key);
clear();
    }
    public void clearOtherJVM() {
        cacheManage.pushlishMessage(redisCache.getName());

    }
    public void  clearLocal() {
    this.local.clear();
    }


    public void clear() {

    }

}

