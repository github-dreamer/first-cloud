package com.example.demo.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.example.demo.entities.CommonResult;

public class CustomerBlockHandler
{
    public static CommonResult handleException(BlockException exception){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler_1");
    }

    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler_2");
    }
}
