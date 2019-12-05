package com.example.xixie.model.coupon;

import java.util.Date;

/**
 * @ClassName Coupon
 * @Description TODO
 * @Author Pnorest
 * @Date 2019/11/27 20:51
 * @Version 1.0
 **/
public class Coupon {
    private Integer id;
    private Double price;
    private String name;
    private Date createTime;
    private Integer status;
    private Date useTime;
    private Integer userId;
    private String type;//三种类型 0通用 1清洗 2修复

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
