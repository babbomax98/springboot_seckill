package com.seckill.service;

import com.seckill.dao.UserDao;
import com.seckill.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author shkstart
 * @create 2020-05-11 10:39
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public User doGetId(int id){
        return userDao.dogetId(id);
    }

    @Transactional
    public boolean tx(){
        User u1=new User();
        u1.setName("cas");

        userDao.insert(u1);
        return true;
    }

}
