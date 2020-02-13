package com.thinkxfactor.demoApp.controllers;

import java.util.ArrayList;
import java.util.List;
import com.thinkxfactor.demoApp.entity.Admin;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping({ "/admin" })
public class AdminController{
    @GetMapping({ "/hello" })
    public String helloadmin() {
        return "hello world";
    }
    
    @GetMapping({ "/hello2" })
    public String hello(@RequestParam("n")  String name) {
       Admin admin = new Admin(name);
        return "hello" + admin.getName();
    }
    
    @GetMapping({ "/helloadmin" })
    public List<Admin> helloadmin(@RequestParam("ne") String name) {
        Admin admin = new Admin(name);
        List<Admin> adminList = new ArrayList<Admin>();
        adminList.add(admin);
        return adminList;
    }
    

}
