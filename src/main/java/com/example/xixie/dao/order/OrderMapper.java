package com.example.xixie.dao.order;

import com.example.xixie.model.order.QxOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<QxOrder> findOrderListByTime(String startDate, String endDate);
    List<QxOrder> findOrderList();


    QxOrder findOrderDetails(String orderNo);

    void updateOrderInfo(String orderNo);

    List<QxOrder> orderSearchList(Integer orderSearch);
}
