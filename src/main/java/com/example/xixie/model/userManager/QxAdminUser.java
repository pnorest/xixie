package com.example.xixie.model.userManager;

import java.util.Date;

/**
 * @ClassName QxAdminUser
 * @Description TODO
 * @Author Pnorest
 * @Date 2019/12/5 13:52
 * @Version 1.0
 **/
public class QxAdminUser {
    private Integer id;
    private String name;
    private String password;
    private Date createTime;
    private Date updateTime;
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
