package com.example.xixie.dao.login;

import com.example.xixie.model.login.AdminUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminUserMapper {
    AdminUser findUserByName(String name);
}
