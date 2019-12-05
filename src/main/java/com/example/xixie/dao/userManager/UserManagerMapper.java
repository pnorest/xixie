package com.example.xixie.dao.userManager;

import com.example.xixie.model.userManager.QxAdminUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserManagerMapper {
    List<QxAdminUser> queryUserListByUser(String searchValue);

    List<QxAdminUser> queryUserList();

    void updateUser(QxAdminUser qxAdminUser);

    void addUser(QxAdminUser qxAdminUser);
}
