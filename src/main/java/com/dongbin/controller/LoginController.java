package com.dongbin.controller;

import com.dongbin.model.User;
import com.dongbin.service.UserService;
import com.dongbin.utils.JWTUtil;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by dongbin on 2018/4/16.
 */
@RestController
@RequestMapping("/")
public class LoginController {
    @Resource
    private UserService userService;

    @RequestMapping("login")
    public Object login(@RequestParam("name") String username,
                        @RequestParam("password") String password) {
        User user = userService.getUserByName(username);
        if (user != null && user.getPassword().equals(password)) {
            return JWTUtil.sign(username, password);
        } else {
            throw new UnauthorizedException();
        }
    }
}
