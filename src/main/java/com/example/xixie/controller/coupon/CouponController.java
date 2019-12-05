package com.example.xixie.controller.coupon;

import com.example.xixie.model.Result;
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
    //新增优惠券信息
    @RequestMapping("/addCoupon")
    @ResponseBody
    public Result addCoupon(Coupon coupon) {
        try {
           couponService.addCoupon(coupon);
           return new Result(Result.CODE.SUCCESS.getCode(),"优惠券信息新增成功");

        }catch (Exception e){
            return new Result(Result.CODE.FAIL.getCode(),"优惠券信息新增失败",e.getMessage());
        }
    }


    //删除  逻辑删除（该接口可直接放入更新接口中）
    @RequestMapping("/deleteCoupon")
    @ResponseBody
    public Result deleteCoupon(Coupon coupon) {//返回订单页面
        try {//把status改为0（不可使用状态）
            couponService.deleteCoupon(coupon);
            return new Result(Result.CODE.SUCCESS.getCode(),"优惠券信息删除成功");

        }catch (Exception e){
            return new Result(Result.CODE.FAIL.getCode(),"优惠券信息删除失败",e.getMessage());
        }
    }




    //优惠券信息修改  若逻辑删除则把status改为0
    @RequestMapping("/updateCoupon")
    @ResponseBody
    public Result updateCoupon(Coupon coupon) {//返回订单页面
        try {  //use_time这里优惠券的使用不明确
            couponService.updateCoupon(coupon);
            return new Result(Result.CODE.SUCCESS.getCode(),"优惠券信息更新成功");
        }catch (Exception e){
            return new Result(Result.CODE.FAIL.getCode(),"优惠券信息更新失败",e.getMessage());
        }
    }

    //全部订单查询
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



    //根据查询条件查询（暂时支持用户id查询，可修改）
    @RequestMapping("/queryCouponListByUser")
    @ResponseBody
    public List<Coupon> queryCouponListByUser(Integer searchValue) {//返回订单页面
        try {
            return couponService.queryCouponListByUser(searchValue);

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


}
