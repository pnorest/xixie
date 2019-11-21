package com.example.xixie.service.order.impl;

import com.example.xixie.dao.order.OrderMapper;
import com.example.xixie.model.order.QxOrder;
import com.example.xixie.service.order.OrderService;
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


}
