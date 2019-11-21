package com.example.xixie.service.login;

import com.example.xixie.model.login.AdminUser;

public interface AdminUserService {
    AdminUser findUserByName(String name);
}
