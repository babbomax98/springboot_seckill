package com.seckill.redis;

/**
 * @author shkstart
 * @create 2020-05-11 13:43
 */
public interface KeyPrefix {

    public int expireSeconds();

    public String getPrefix();

}
