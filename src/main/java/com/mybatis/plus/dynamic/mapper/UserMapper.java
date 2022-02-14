package com.mybatis.plus.dynamic.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatis.plus.dynamic.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * UserMapper
 *
 * @author gaoxinzhong
 * @date 2022/2/14 17:01
 **/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
