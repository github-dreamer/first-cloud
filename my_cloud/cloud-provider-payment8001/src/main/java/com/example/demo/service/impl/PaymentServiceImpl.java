package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.PaymentDao;
import com.example.demo.entities.Payment;
import com.example.demo.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther zzyy
 * @create 2020-01-27 21:12
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentDao, Payment> implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment)
    {
//        return paymentDao.create(payment);
        return paymentDao.insert(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
//        return paymentDao.getPaymentById(id);
        return paymentDao.selectById(id);
    }
}
