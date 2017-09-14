package com.qkq.dao;

import com.qkq.bean.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/9/14 0014.
 */
@Repository("userDao")
public interface IUserDao {
    void insertUser(User user);

    User queryUser();
}
