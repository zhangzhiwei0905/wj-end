package com.zzw.wj.controller;

import com.zzw.wj.pojo.User;
import com.zzw.wj.result.Result;
import com.zzw.wj.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述
 *
 * @author z00770293
 * @since 2023年04月05日
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    private final static Integer SUCCESS_CODE = 200;

    @Autowired
    private UserService userService;

    @CrossOrigin
    @PostMapping(value = "/register")
    @ResponseBody
    public Result registerUser(@RequestBody User user) {
        if (user.getUsername().equals("") || user.getPassword().equals("")) {
            return new Result(60001, "用户名和密码不能为空");
        }
        if (userService.isExist(user.getUsername())) {
            return new Result(60002, "账户名已存在");
        }
        if (userService.isExist(user.getPhone())) {
            return new Result(60003, "该邮箱已被注册");
        }
        if (userService.isExist(user.getPhone())) {
            return new Result(60004, "该手机号已被注册");
        }
        userService.add(user);
        return new Result(SUCCESS_CODE, "成功");
    }
}
