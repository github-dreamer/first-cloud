package com.example.demo.servcie;

import com.example.demo.domain.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
