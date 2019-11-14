package com.itheima.mapper;


import com.itheima.domain.User;

import java.util.List;

public interface UserMapper {
    //查询所有用户信息
   // @Select("select * from users")
    List<User> findAll() throws Exception;

    User findById(String id);
}
