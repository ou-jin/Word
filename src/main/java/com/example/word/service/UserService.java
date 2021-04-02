package com.example.word.service;

import com.example.word.dao.UserDao;
import com.example.word.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserService {
    @Autowired
    private UserDao userDao;

    /*
     * 新增用户
     * */
    public void addUser(User user) {
        userDao.addUser(user);
    }

    /*
     * 删除用户
     * */
    public void deleteUser(String account) {
        userDao.del(account);
    }

    /*
     * 更新用户
     * */
    public void updateUser(User user) {
        userDao.update(user);
    }

    /*
     * 根据账户获取用户
     * */
    public User getUser(String account) {
        return userDao.getUserByAccount(account);
    }


}
