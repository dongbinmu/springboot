package com.dongbin.controller;

import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dongbin on 2018/4/15.
 */
@RestController
@RequestMapping("api/user")
public class UserController {

    @RequestMapping("info")
    @RequiresAuthentication
    public String getValue() {
        return "docker";
    }
}
