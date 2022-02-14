package com.mybatis.plus.dynamic.controller;

import com.mybatis.plus.dynamic.api.UserApi;
import com.mybatis.plus.dynamic.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author gaoxinzhong
 * @date 2022/2/14 17:11
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserApi userApi;

    @PostMapping(value = "/save")
    public Long save(@RequestBody User user) {
        return userApi.save(user);
    }
}
