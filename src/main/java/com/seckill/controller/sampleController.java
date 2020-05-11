package com.seckill.controller;



import com.seckill.domain.User;
import com.seckill.excution.Msg;
import com.seckill.redis.KeyPrefix;
import com.seckill.redis.RedisService;
import com.seckill.redis.UserKey;
import com.seckill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2020-05-11 9:58
 */
@RestController
public class sampleController {

    @Autowired
    UserService userService;

    @Autowired
    RedisService redisService;

    @RequestMapping("/demo")
    public String demo(Model model){
        model.addAttribute("name","halon");

        return "hello";
    }


    @RequestMapping("/doget")
    public Msg doGet(){
        User user = userService.doGetId(1);
        return Msg.success().add("user",user);
    }

    @RequestMapping("/redisget")
    public Msg redisGet(){
        User user=redisService.get(UserKey.getById,""+1,User.class);
        return Msg.success().add("v1",user);
    }
    @RequestMapping("/redisset")
    public Msg redisSet(){
//        Boolean ret=redisService.set(UserKey.getById,"key2","hello");
//        String str=redisService.get(KeyPrefix,"key2",String.class);
//        return Msg.success();
        User user=new User();
        user.setId(1);
        user.setName("aaa");
        redisService.set(UserKey.getById,""+1,user);
        return Msg.success();

    }

}
