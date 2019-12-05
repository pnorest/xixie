package com.example.xixie.service.coupon.impl;

import com.example.xixie.dao.coupon.CouponMapper;
import com.example.xixie.model.coupon.Coupon;
import com.example.xixie.model.coupon.vo.CouponVo;
import com.example.xixie.model.wxUser.WxUser;
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

    public List<CouponVo> queryCouponList(){
        return couponMapper.queryCouponList();
    }

    public void addCoupon(CouponVo couponVo){
        couponMapper.addCoupon(couponVo);
    }

    public void deleteCoupon(CouponVo couponVo){
        couponMapper.deleteCoupon(couponVo);
    }



    public void updateCoupon(CouponVo couponVo){
        couponMapper.updateCoupon(couponVo);
    }


    public List<CouponVo> queryCouponListByUser(String searchValue){
        return couponMapper.queryCouponListByUser(searchValue);
    }

    public CouponVo queryCouponInfoById(Integer id){
        return couponMapper.queryCouponInfoById(id);
    }


    public List<WxUser> queryWxNickNameList(){
        return couponMapper.queryWxNickNameList();
    }




}
