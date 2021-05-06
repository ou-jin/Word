package com.example.word.controller;

import com.example.word.entity.Result;
import com.example.word.entity.User;
import com.example.word.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class userController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Result add(@RequestParam("user") User user) {
        userService.addUser(user);
        return new Result(200, "success");
    }

    @RequestMapping(value = "/del", method = RequestMethod.POST)
    public Result del(@RequestParam("user") User user) {
        userService.deleteUser(user.getAccount());
        return new Result(200, "success");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Result update(@RequestParam("user") User user) {
        userService.updateUser(user);
        return new Result(200, "success");
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result login(@RequestBody User user) {
        User userInfo = userService.getUser(user.account);
        if (userInfo == null || !userInfo.password.equals(user.password)) {
            return new Result(100, "账号密码错误");
        } else {
            return new Result(200, "success", userInfo);
        }
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User test(@RequestParam("account") String account) {
        return userService.getUser(account);
    }
}
