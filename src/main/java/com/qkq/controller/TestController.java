package com.qkq.controller;

import com.qkq.bean.User;
import com.qkq.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

/**
 * Created by Administrator on 2017/9/14 0014.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private MessageSource messages;

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
    public User getUser(Locale locale) {
        User user = userService.getUser();
        System.out.println(messages.getMessage("title", new Object[]{}, locale));
        return user;
    }
}
