package com.swylg.java.controller;

import com.swylg.java.entity.User;
import com.swylg.java.service.UserService;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * Created by shuchen on 2017/8/15.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping("")
    public String home(){
        List<User> us = new ArrayList<User>();
        User u = new User();
        u.setUsername("Hello");
        us.add(u);
        u = new User();
        u.setUsername("World");
        us.add(u);
        userService.saveUsers(us);
        return "index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public List<User> json(){
        return userService.getAllUsernames();
    }

}
