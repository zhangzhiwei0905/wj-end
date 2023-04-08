package com.zzw.wj.controller;

import com.zzw.wj.pojo.LoginInfo;
import com.zzw.wj.pojo.User;
import com.zzw.wj.result.Result;
import com.zzw.wj.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 功能描述
 *
 * @author z00770293
 * @since 2023年04月02日
 */
@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody LoginInfo loginInfo, HttpSession session) {
        User user = userService.getUser(loginInfo);
        if (null == user) {
            return new Result(400, "账号不存在");
        } else {
            if (loginInfo.getPassword().equals(user.getPassword())) {
                session.setAttribute("user", user);
                return new Result(200, "成功", user);
            } else {
                return new Result(400, "密码错误");
            }
        }
    }

    @CrossOrigin
    @PostMapping(value = "api/logout")
    @ResponseBody
    public Result logout(HttpSession session) {
        session.removeAttribute("user");
        String message = "成功";
        return new Result(200, message);
    }
}
