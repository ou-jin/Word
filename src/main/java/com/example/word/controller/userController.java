package com.example.word.controller;

import com.example.word.entity.Result;
import com.example.word.entity.User;
import com.example.word.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
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

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User test(@RequestParam("account") String account) {
        return userService.getUser(account);
    }
}
