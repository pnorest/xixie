package com.example.xixie.controller.order;

import com.example.xixie.model.order.QxOrder;
import com.example.xixie.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author Pnorest
 * @Date 2019/11/20 20:38
 * @Version 1.0
 **/
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService; ;

    @RequestMapping("/orderList")
    public List<QxOrder> orderList() {
        try {
            return orderService.findOrderList();

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
