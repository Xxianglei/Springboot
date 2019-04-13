package com.xianglei.controller;

import com.xianglei.pojo.User;
import com.xianglei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/xl")
@Controller
public class WelcomeBootController {

    @Autowired
    UserService userService;

    @RequestMapping("/getlist")
    public String getAll(Model Model){
        List<User> users = userService.find();
        Model.addAttribute("list",users);
        return "user/list";
    }
}
