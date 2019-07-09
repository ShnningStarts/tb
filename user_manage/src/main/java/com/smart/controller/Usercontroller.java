package com.smart.controller;

import com.querydsl.core.types.Order;
import com.smart.DTO.UserLogginDto;
import com.smart.service.UserService;
import com.smart.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class Usercontroller {
    @Autowired
    UserService userService;
    @PostMapping(path = "/loggin",params = "action=loggin")
    public  UserLogginDto Loggin(@PathVariable String iden,String password){
        return userService.Loggin(iden, password);
    }
    @RequestMapping({"/","/index"})
    public String index(){
        return"/index";
    }

    @RequestMapping("/403")
    public String unauthorizedRole(){
        System.out.println("------没有权限-------");
        return "/user/403";
    }


}
