package com.wonders.xlab.myproj.controller;

import com.wonders.xlab.myproj.entity.User;
import com.wonders.xlab.myproj.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * Created by wangqiang on 16/1/29.
 */
@RestController
@RequestMapping("myController")
public class MyController {

    @Inject
    private UserService userService;

    @RequestMapping(value = "findOne/{id}", method = RequestMethod.GET)
    public User findOne(@PathVariable long id) {
        System.out.println("MyController.findOne");
        return (User) userService.findOne(id);
    }
}
