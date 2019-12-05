package com.example.xixie.service.coupon;

import com.example.xixie.model.Result;
import com.example.xixie.model.coupon.Coupon;
import com.example.xixie.model.coupon.vo.CouponVo;
import com.example.xixie.model.wxUser.WxUser;

import java.util.List;

public interface CouponService {
    List<CouponVo> queryCouponList();

    void addCoupon(CouponVo couponVo);

    void deleteCoupon(CouponVo couponVo);

    void updateCoupon(CouponVo couponVo);

    List<CouponVo> queryCouponListByUser(String searchValue);

    CouponVo queryCouponInfoById(Integer id);

    List<WxUser> queryWxNickNameList();

    void batchDeleteCoupon(List<CouponVo> couponIdList);
}
