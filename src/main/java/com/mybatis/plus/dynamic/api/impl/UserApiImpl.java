package com.mybatis.plus.dynamic.api.impl;

import com.mybatis.plus.dynamic.api.UserApi;
import com.mybatis.plus.dynamic.entity.Role;
import com.mybatis.plus.dynamic.entity.User;
import com.mybatis.plus.dynamic.service.RoleServiceImpl;
import com.mybatis.plus.dynamic.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * UserApiImpl
 *
 * @author gaoxinzhong
 * @date 2022/2/14 17:04
 **/
@Service
public class UserApiImpl implements UserApi {

    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private RoleServiceImpl roleService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Long save(User user) {

        userService.save(user);

        Role role = new Role();
        role.setName(user.getName());

        roleService.save(role);

        return user.getId();
    }
}
