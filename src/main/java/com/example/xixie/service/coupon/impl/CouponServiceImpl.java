package com.example.xixie.service.coupon.impl;

import com.example.xixie.dao.coupon.CouponMapper;
import com.example.xixie.model.coupon.Coupon;
import com.example.xixie.service.coupon.CouponService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName CouponServiceImpl
 * @Description TODO
 * @Author Pnorest
 * @Date 2019/11/26 22:26
 * @Version 1.0
 **/

@Service
public class CouponServiceImpl implements CouponService {
    @Resource
    private CouponMapper couponMapper;

    public List<Coupon> queryCouponList(){
        return couponMapper.queryCouponList();
    }

    public void addCoupon(Coupon coupon){
        couponMapper.addCoupon(coupon);
    }

    public void deleteCoupon(Coupon coupon){
        couponMapper.deleteCoupon(coupon);
    }



    public void updateCoupon(Coupon coupon){
        couponMapper.updateCoupon(coupon);
    }


}
