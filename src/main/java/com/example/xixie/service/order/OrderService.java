package com.example.xixie.service.order;

import com.example.xixie.model.order.QxOrder;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface OrderService {
    List<QxOrder> findOrderList();

    QxOrder orderDetails(String order_no);

    void updateOrderInfo(String orderNo);

     PageInfo<QxOrder> queryOrderList(Integer pageNum, Integer pageSize, String startDate, String endDate);

    List<QxOrder> orderSearchList(Integer orderSearch);
}
