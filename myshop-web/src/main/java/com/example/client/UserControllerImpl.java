package com.example.client;

import com.example.pojo.User;
import org.springframework.stereotype.Component;

/**
 * 熔断器类
 */
@Component
public class UserControllerImpl implements UserController
{
    @Override
    public User findById(Integer id)
    {
        System.out.println("执行了熔断器类......");
        return null;
    }
}
