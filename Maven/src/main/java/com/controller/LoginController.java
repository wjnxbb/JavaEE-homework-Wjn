package com.controller;

import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author haya
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String login(String account, String password) {
        boolean flag = userService.login( account, password );
        return "index";
    }
}
