package com.seckill.dao;

import com.seckill.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2020-05-11 10:37
 */
@Mapper
@Component
public interface UserDao {

    @Select("select * from user where id=#{id}")
    public User dogetId(@Param("id")int id);

    @Insert("insert into user(name) values(#{name})")
    public int insert(User user);
}
