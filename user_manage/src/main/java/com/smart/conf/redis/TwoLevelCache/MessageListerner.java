package com.smart.conf.redis.TwoLevelCache;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

import java.io.UnsupportedEncodingException;

public class MessageListerner extends MessageListenerAdapter {
    @Bean
    MessageListenerAdapter listenerAdapter(final TwoLevelCacheManage cache){
        return new MessageListenerAdapter(new MessageListener(){
            @Override
            public void onMessage(Message message, byte[] pattern) {
                byte[] bs=message.getChannel();
                try {
                    String type=new String(bs,"UTF-8");
                    cache.receiver(type);
                }catch (UnsupportedEncodingException e){
                    e.printStackTrace();
                }
            }
        });
    }

}
