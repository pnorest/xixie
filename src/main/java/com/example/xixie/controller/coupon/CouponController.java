package com.example.xixie.controller.coupon;

import com.example.xixie.service.coupon.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
