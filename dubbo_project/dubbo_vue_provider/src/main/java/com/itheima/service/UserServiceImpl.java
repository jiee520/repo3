package com.itheima.service;



import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(interfaceClass = UserService.class)   //UserServiceImpl的对象发布到注册中心(暴露服务)
@Transactional
public class UserServiceImpl implements UserService {
    /*注入mapper*/
    @Autowired
    private UserMapper userMapper;
    public List<User> findAll() throws Exception {
        return userMapper.findAll();
    }

    public User findById(String id) {
        return userMapper.findById(id);
    }
}
