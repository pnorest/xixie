package com.example.xixie.controller.order;

import com.example.xixie.model.order.QxOrder;
import com.example.xixie.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author Pnorest
 * @Date 2019/11/20 20:38
 * @Version 1.0
 **/
@Controller
public class OrderController {

    @Autowired
    private OrderService orderService; ;


    @RequestMapping("/order")
    public String oder() {//返回订单页面
        try {
            return "order";

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping("/orderList")
    public List<QxOrder> orderList() {//返回订单列表数据
        try {
            return orderService.findOrderList();

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping("/orderDetails")
    public QxOrder orderDetails(String order_no) {//根据order_no订单编号查询订单详细数据
        try {
            return orderService.orderDetails(order_no);

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    @RequestMapping("/updateOrderInfo")
    public void updateOrderInfo(String orderNo) {//根据order_no订单编号修改订单详细数据
        try {
             orderService.updateOrderInfo(orderNo);

        }catch (Exception e){
            e.printStackTrace();
        }
    }




}
