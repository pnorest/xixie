package com.example.xixie.service.order.impl;

import com.example.xixie.dao.order.OrderMapper;
import com.example.xixie.model.order.QxOrder;
import com.example.xixie.service.order.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName OderServiceImpl
 * @Description TODO
 * @Author Pnorest
 * @Date 2019/11/20 21:03
 * @Version 1.0
 **/
@Service
public class OderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    public List<QxOrder> findOrderList(){
        return orderMapper.findOrderList();
    }

    public PageInfo<QxOrder> queryOrderList(Integer pageNum, Integer pageSize, String startDate, String endDate)
    {
        PageHelper.startPage(pageNum, pageSize);
        List<QxOrder> confHisList = orderMapper.findOrderListByTime(startDate, endDate);
        PageInfo<QxOrder> dumpsRawStatPageInfo = new PageInfo(confHisList);
        return dumpsRawStatPageInfo;
    }

    public List<QxOrder> orderSearchList(Integer orderSearch){
        return orderMapper.orderSearchList(orderSearch);
    }

    public QxOrder orderDetails(String orderNo){
        return orderMapper.findOrderDetails(orderNo);
    }


    public void updateOrderInfo(String orderNo){
         orderMapper.updateOrderInfo(orderNo);
    }





}
