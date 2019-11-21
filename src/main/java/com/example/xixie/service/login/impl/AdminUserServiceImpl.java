package com.example.xixie.service.login.impl;

import com.example.xixie.dao.login.AdminUserMapper;
import com.example.xixie.model.login.AdminUser;
import com.example.xixie.service.login.AdminUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Resource
    private AdminUserMapper adminUserMapper;

    @Override
    public AdminUser findUserByName(String name) {
        return adminUserMapper.findUserByName(name);
    }
}
