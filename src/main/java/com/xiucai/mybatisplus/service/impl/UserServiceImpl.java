package com.xiucai.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiucai.mybatisplus.mapper.UserMapper;
import com.xiucai.mybatisplus.pojo.User;
import com.xiucai.mybatisplus.service.UserService;

import org.springframework.stereotype.Service;

/**
 * @author xiucai
 * @date 2022/12/25 17:20
 * @description 自定义Service实现类的方式
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
