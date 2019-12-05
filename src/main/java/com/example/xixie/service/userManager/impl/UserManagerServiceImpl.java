package com.example.xixie.service.userManager.impl;

import com.example.xixie.dao.userManager.UserManagerMapper;
import com.example.xixie.model.userManager.QxAdminUser;
import com.example.xixie.service.userManager.UserManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserManagerServiceImpl
 * @Description TODO
 * @Author Pnorest
 * @Date 2019/12/5 13:46
 * @Version 1.0
 **/
@Service
public class UserManagerServiceImpl implements UserManagerService {
    @Resource
    private UserManagerMapper userManagerMapper;

    public List<QxAdminUser> queryUserListByUser(String searchValue){
        return userManagerMapper.queryUserListByUser(searchValue);

    }

    public List<QxAdminUser> queryUserList(){
        return userManagerMapper.queryUserList();
    }

    public void updateUser(QxAdminUser qxAdminUser){
        userManagerMapper.updateUser(qxAdminUser);
    }

    public void addUser(QxAdminUser qxAdminUser){
        userManagerMapper.addUser(qxAdminUser);
    }



}
