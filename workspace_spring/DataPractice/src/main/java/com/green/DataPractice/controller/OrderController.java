package com.green.DataPractice.controller;

import com.green.DataPractice.vo.DeliveryVo;
import com.green.DataPractice.vo.OrderVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    @GetMapping("/orderInfo")
    public String orderFirst() {
        return "order";
    }

    @PostMapping("/deliveryInfo")
    public String orderSecond(OrderVo orderVo) {
        System.out.println(orderVo);
        return "delivery";
    }

    @PostMapping("/receipt")
    public String orderThird(OrderVo orderVo, DeliveryVo deliveryVo) {
        System.out.println(orderVo);
        System.out.println(deliveryVo);
        return "order_info";
    }
}
