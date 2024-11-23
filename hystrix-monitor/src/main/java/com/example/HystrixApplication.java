package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hystrix Dashboard 启动类
 */
@SpringBootApplication
@EnableHystrixDashboard    // 开启 Hystrix Dashboard 监控面板
public class HystrixApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(HystrixApplication.class, args);
    }
}
