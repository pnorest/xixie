package com.example.xixie.controller.order;

import com.example.xixie.model.order.QxOrder;
import com.example.xixie.service.order.OrderService;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @ResponseBody
    public List<QxOrder> orderList() {//返回订单列表数据
        try {
            return orderService.findOrderList();

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping("/orderSearch")
    @ResponseBody
    public List<QxOrder> orderSearch(Integer searchValue) {//返回订单列表数据
        try {
            return orderService.orderSearchList(searchValue);

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    /**
     * @description 查询所有订单数据并分页
     * @author ZL
     * @date 2019/1/3 9:55
     **/
    @RequestMapping("/queryOrderList")
    @ResponseBody
    public PageInfo<QxOrder> queryOrderList(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize, @Param("startDate") String startDate, @Param("endDate") String endDate) {
        PageInfo<QxOrder> orderListInfo = orderService.queryOrderList(pageNum, pageSize, startDate, endDate);
        return orderListInfo;

    }


    @RequestMapping("/orderDetail")
    public String orderDetail(String orderNo) {//根据order_no订单编号查询订单详细数据
        try {
            return "orderDetail";
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping("/orderVue")
    public String orderDetails() {//根据order_no订单编号查询订单详细数据
        try {
            return "orderVue";

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    @RequestMapping("/test")
    public String test() {//根据order_no订单编号查询订单详细数据
        try {
            return "test";

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
