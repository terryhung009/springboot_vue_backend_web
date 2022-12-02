package com.danny.controller;


import com.danny.common.Result;
import com.danny.entity.User;
import com.danny.mapper.UserMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserMapper userMapper;

    @PostMapping
    public Result save(@RequestBody User user){
        userMapper.insert(user);





        return Result.succ(user);


    }


}
