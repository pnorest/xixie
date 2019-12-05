package com.example.xixie.service.userManager;

import com.example.xixie.model.userManager.QxAdminUser;

import java.util.List;

/**
 * @ClassName UserManagerService
 * @Description TODO
 * @Author Pnorest
 * @Date 2019/12/5 13:45
 * @Version 1.0
 **/

public interface UserManagerService {

    List<QxAdminUser> queryUserListByUser(String searchValue);

    List<QxAdminUser> queryUserList();

    void updateUser(QxAdminUser qxAdminUser);

    void addUser(QxAdminUser qxAdminUser);
}
