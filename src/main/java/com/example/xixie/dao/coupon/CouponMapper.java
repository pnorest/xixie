package com.example.xixie.dao.coupon;

import com.example.xixie.model.coupon.Coupon;
import com.example.xixie.model.coupon.vo.CouponVo;
import com.example.xixie.model.wxUser.WxUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CouponMapper {

    List<CouponVo> queryCouponList();

    void addCoupon(CouponVo couponVo);

    void deleteCoupon(CouponVo couponVo);

    void updateCoupon(CouponVo couponVo);

    List<CouponVo> queryCouponListByUser(String searchValue);

    CouponVo queryCouponInfoById(Integer id);

    List<WxUser> queryWxNickNameList();
}
