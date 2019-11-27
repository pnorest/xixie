package com.example.xixie.controller.coupon;

import com.example.xixie.model.coupon.Coupon;
import com.example.xixie.service.coupon.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName CouponController
 * @Description TODO
 * @Author Pnorest
 * @Date 2019/11/26 22:25
 * @Version 1.0
 **/
@Controller
public class CouponController {

    @Autowired
    private CouponService couponService;

    @RequestMapping("/coupon")
    public String coupon() {//返回订单页面
        try {
            return "coupon";

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    //增
    @RequestMapping("/addCoupon")
    @ResponseBody
    public void addCoupon(Coupon coupon) {//返回订单页面
        try {
           couponService.addCoupon(coupon);

        }catch (Exception e){
            e.printStackTrace();

        }
    }


    //删除  逻辑删除  把status改为0
    @RequestMapping("/deleteCoupon")
    @ResponseBody
    public void deleteCoupon(Coupon coupon) {//返回订单页面
        try {
            couponService.deleteCoupon(coupon);

        }catch (Exception e){
            e.printStackTrace();

        }
    }


    //改  把status改为0
    @RequestMapping("/updateCoupon")
    @ResponseBody
    public void updateCoupon(Coupon coupon) {//返回订单页面
        try {
            couponService.updateCoupon(coupon);

        }catch (Exception e){
            e.printStackTrace();

        }
    }

    //查
    @RequestMapping("/queryCouponList")
    @ResponseBody
    public List<Coupon> queryCouponList() {//返回订单页面
        try {
            return couponService.queryCouponList();

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


}
