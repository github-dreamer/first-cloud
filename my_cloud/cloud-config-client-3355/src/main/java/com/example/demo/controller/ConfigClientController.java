package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController
{
    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;


    @GetMapping("/configInfo")
    public String configInfo()
    {
        return "serverPort: "+serverPort+"\t\n\n configInfo: "+configInfo;
    }


    // 只能访问到本服务的yml中的other.testconfig,把本服务的other.testconfig注释掉,无法访问到配置中心的other.testconfig
    @GetMapping("/testconfig")
    public String testconfig(@Value("${other.testconfig}") String testconfig)
    {
        return "testconfig: " +testconfig;
    }
}
