package com.ybzbcq.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ybzbcq.model.TUser;
import com.ybzbcq.service.TUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class TUserController {

    @Reference(version = "1.0.0")
    private TUserService tUserService;

    @RequestMapping("get")
    public Object getTUser(@RequestParam("id") Integer id){
        TUser userById = tUserService.getUserById(id);
        return userById;
    }

    @RequestMapping("hi")
    public String getSayHi(@RequestParam("name") String name){
        String s = tUserService.sayHI(name);
        return s;
    }
}
