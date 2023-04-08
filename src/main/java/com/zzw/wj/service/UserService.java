package com.zzw.wj.service;

import com.zzw.wj.dao.UserDao;
import com.zzw.wj.pojo.LoginInfo;
import com.zzw.wj.pojo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能描述
 *
 * @author z00770293
 * @since 2023年04月02日
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDAO;

    public boolean isExist(String username) {
        User user = getByName(username);
        return null != user;
    }

    public User getByName(String username) {
        return userDAO.findByUsername(username);
    }

    public User get(String username, String password) {
        return userDAO.getByUsernameAndPassword(username, password);
    }

    public void add(User user) {
        userDAO.save(user);
    }

    public User getUser(LoginInfo loginInfo) {
        return userDAO.validateUser(loginInfo);
    }


}
