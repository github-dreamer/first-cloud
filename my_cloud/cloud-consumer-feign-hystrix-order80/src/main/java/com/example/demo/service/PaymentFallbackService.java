package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "--------default-----paymentInfo_OK-----------";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return null;
    }
}
