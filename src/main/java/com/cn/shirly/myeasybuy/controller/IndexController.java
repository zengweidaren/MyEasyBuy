package com.cn.shirly.myeasybuy.controller;

import com.cn.shirly.myeasybuy.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    UserDao userDao;

    @RequestMapping("/login")
    public String index(String userName,String email) {
        System.out.println("用户名为："+userName);
        System.out.println("邮箱为："+email);
        int count= userDao.getUserByLoginName(userName,email);
        if(count>0){
            return "ok";
        }
        return "no";
    }
}
