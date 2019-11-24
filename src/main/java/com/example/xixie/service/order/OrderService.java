package com.example.xixie.service.order;

import com.example.xixie.model.order.QxOrder;

import java.util.List;

public interface OrderService {
    List<QxOrder> findOrderList();

    QxOrder orderDetails(String order_no);

    void updateOrderInfo(String orderNo);
}
