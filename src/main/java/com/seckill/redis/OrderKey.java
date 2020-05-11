package com.seckill.redis;

/**
 * @author shkstart
 * @create 2020-05-11 14:01
 */
public class OrderKey extends BasePrefix {
    public OrderKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }
}
