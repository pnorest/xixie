package com.example.xixie.service.coupon;

import com.example.xixie.model.coupon.Coupon;

import java.util.List;

public interface CouponService {
    List<Coupon> queryCouponList();

    void addCoupon(Coupon coupon);

    void deleteCoupon(Coupon coupon);

    void updateCoupon(Coupon coupon);

    List<Coupon> queryCouponListByUser(Integer userId);
}
