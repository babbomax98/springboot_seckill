package com.seckill.redis;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.seckill.domain.User;

/**
 * @author shkstart
 * @create 2020-05-11 13:59
 */
public class UserKey extends BasePrefix {
    private UserKey(String prefix) {
        super(prefix);
    }

    public static UserKey getById=new UserKey("id");
    public static UserKey getByName=new UserKey("name");
}
