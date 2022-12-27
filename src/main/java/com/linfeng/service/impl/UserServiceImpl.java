package com.linfeng.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.linfeng.entity.User;
import com.linfeng.mapper.UserMapper;
import com.linfeng.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
