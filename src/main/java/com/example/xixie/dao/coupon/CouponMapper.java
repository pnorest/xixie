package com.example.xixie.dao.coupon;

import com.example.xixie.model.coupon.Coupon;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CouponMapper {

    List<Coupon> queryCouponList();

    void addCoupon(Coupon coupon);

    void deleteCoupon(Coupon coupon);

    void updateCoupon(Coupon coupon);

    List<Coupon> queryCouponListByUser(Integer userId);
}
