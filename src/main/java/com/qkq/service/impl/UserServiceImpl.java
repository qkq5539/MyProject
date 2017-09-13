package com.qkq.service.impl;

import com.qkq.bean.User;
import com.qkq.dao.IUserDao;
import com.qkq.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/9/14 0014.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource(name = "userDao")
    private IUserDao userDao;

    public void addUser(User user) {
        userDao.insertUser(user);
    }
}
