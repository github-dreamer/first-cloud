package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @auther zzyy
 * @create 2020-01-27 21:11
 */
public interface PaymentService extends IService<Payment>
{
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}
