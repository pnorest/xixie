package com.example.xixie.controller.userManager;

import com.example.xixie.model.Result;
import com.example.xixie.model.userManager.QxAdminUser;
import com.example.xixie.service.userManager.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName UserManagerController
 * @Description TODO
 * @Author Pnorest
 * @Date 2019/12/5 13:42
 * @Version 1.0
 **/
@Controller
public class UserManagerController {

    @Autowired
    private UserManagerService userManagerService;

    @RequestMapping("/userManager")
    public String coupon() {//返回用户管理页面
        try {
            return "userManager";
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    //新增优惠券信息
    @RequestMapping("/addUser")
    @ResponseBody
    public Result addUser(QxAdminUser qxAdminUser) {
        try {
            userManagerService.addUser(qxAdminUser);
            return new Result(Result.CODE.SUCCESS.getCode(),"用户信息新增成功");

        }catch (Exception e){
            return new Result(Result.CODE.FAIL.getCode(),"用户信息新增失败",e.getMessage());
        }
    }






    //用户信息修改  若逻辑删除则把status改为0
    @RequestMapping("/updateUser")
    @ResponseBody
    public Result updateUser(QxAdminUser qxAdminUser) {
        try {
            userManagerService.updateUser(qxAdminUser);
            return new Result(Result.CODE.SUCCESS.getCode(),"用户信息更新成功");
        }catch (Exception e){
            return new Result(Result.CODE.FAIL.getCode(),"用户信息更新失败",e.getMessage());
        }
    }

    //全部用户信息列表查询
    @RequestMapping("/queryUserList")
    @ResponseBody
    public List<QxAdminUser> queryUserList() {
        try {
            return userManagerService.queryUserList();

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }



    //根据查询条件查询用户信息（暂时支持用户姓名查询，可修改）
    @RequestMapping("/queryUserListByUser")
    @ResponseBody
    public List<QxAdminUser> queryUserListByUser(String searchValue) {//返回订单页面
        try {
            return userManagerService.queryUserListByUser(searchValue);

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }





}
