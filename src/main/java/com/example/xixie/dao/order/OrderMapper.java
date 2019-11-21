package com.example.xixie.dao.order;

import com.example.xixie.model.order.QxOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<QxOrder> findOrderList();
}
