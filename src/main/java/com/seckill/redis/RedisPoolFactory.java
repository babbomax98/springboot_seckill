package com.seckill.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author shkstart
 * @create 2020-05-11 12:32
 */
@Service
public class RedisPoolFactory {


    @Autowired
    RedisConfig redisConfig;
    @Bean
    public JedisPool JedisPoolFactory(){
        JedisPoolConfig poolConfig=new JedisPoolConfig();
        poolConfig.setMaxIdle(redisConfig.getMaxIdle());
        poolConfig.setMaxWaitMillis(redisConfig.getMaxWait()*1000);
        JedisPool jp=new JedisPool(poolConfig,redisConfig.getHost(),redisConfig.getPort(),
                redisConfig.getTimeout()*1000,redisConfig.getPassword(),0);
        return jp;
    }
}
