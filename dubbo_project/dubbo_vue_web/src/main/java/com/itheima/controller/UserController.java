package com.itheima.controller;



import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Reference
    private UserService userService;
    @RequestMapping("/findAll")
    public List<User> findAll()throws Exception{
        return userService.findAll();
    }
    @RequestMapping("/findById")
    public User findById(String ids)throws Exception{
        return userService.findById(ids);
    }
}
