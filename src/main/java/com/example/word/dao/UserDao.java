package com.example.word.dao;

import com.example.word.entity.User;
import org.apache.coyote.Response;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    // 获取用户
    public User getUserByAccount(String account);
    // 新增用户
    public void addUser(User user);
    // 更新用户
    public void update(User user);
    // 删除用户
    public void del(String account);

}
