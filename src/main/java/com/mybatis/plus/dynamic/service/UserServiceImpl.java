package com.mybatis.plus.dynamic.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mybatis.plus.dynamic.entity.User;
import com.mybatis.plus.dynamic.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 *
 * @author gaoxinzhong
 * @date 2022/2/14 17:02
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> {

}
