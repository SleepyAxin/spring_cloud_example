package com.example.controller;

import com.example.pojo.User;
import com.example.client.UserController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/*** 购票Controller */
@RequestMapping("/web")
@RestController
@Api(description = "购票web核心接口Api")
public class WebController
{
    @Qualifier("com.example.client.UserController")
    @Autowired
    private UserController userController;

    private static final Log logger = LogFactory.getLog(WebController.class);

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    @ApiOperation(value = "远程方法：通过用户ID查询用户的方法")
    public String order()
    {
        logger.info("开始调用购票微服务order方法！");
        Integer id = 2;
        User user = userController.findById(id);
        if (user != null) System.out.println(user.getUsername() + "==正在购票......");
        else System.out.println("用户不存在");
        return "购票成功";
    }
}

