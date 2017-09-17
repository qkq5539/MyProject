package com.qkq.controller;

import com.qkq.bean.User;
import com.qkq.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/9/14 0014.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private MessageSourceAccessor messages;

    @Autowired
    private IUserService userService;


    @RequestMapping(value = "/addUser", produces = "application/json")
    @ResponseBody
    public void addUser() {
        User user = new User();
        user.setId("123");
        user.setName("qkq");
        user.setAge("10");
        userService.addUser(user);
    }

    @RequestMapping(value = "/getUser", produces = "application/json")
    @ResponseBody
    public User getUser() {
        User user = userService.getUser();
        System.out.println(messages.getMessage("title"));
        return user;
    }
}
