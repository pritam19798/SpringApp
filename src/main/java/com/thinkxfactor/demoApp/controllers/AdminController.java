package com.thinkxfactor.demoApp.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.thinkxfactor.demoApp.entity.Admin;
import com.thinkxfactor.demoApp.repository.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping({ "/admin" })
public class AdminController{

    @Autowired
    AdminRepository adminRepository;

    @GetMapping({ "/hello" })
    public String helloadmin() {
        return "hello world";
    }
    
    @GetMapping({ "/adminobject" })
    public Admin hello(@RequestParam("n")  String a) {
        String[] ar=a.split(",");
        Admin admin = new Admin(ar[0],ar[1],ar[2]);
        return admin;
    }
    
    @GetMapping({ "/listadmin" })
    public List<Admin> listadmin() {
        List<Admin> adminList = new ArrayList<Admin>();
        Admin admin = new Admin("pritam","A_1","p1234");
        adminList.add(admin);
        admin = new Admin("Ishita","A_2","I1234");
        adminList.add(admin);
        admin = new Admin("Riddhi","A_3","r1234");
        adminList.add(admin);
        admin = new Admin("soumi","A_4","s1234");
        adminList.add(admin);
        admin = new Admin("Sounya","A_5","1234");
        adminList.add(admin);
        return adminList;
    }

    @GetMapping({"/get"})
    public Admin get(@RequestParam Long id){
        Optional<Admin> byId=adminRepository.findById(id);
        return byId.get();
    }

    @PostMapping({"/add"})
    public Admin add(@RequestBody Admin admin){

        Admin persistedAdmin=adminRepository.saveAndFlush(admin);
        return persistedAdmin;
    }

    // @PostMapping({"/add"})
    // public Admin add(@RequestBody Admin admin){
    //     admin.setPassword("newpassword");
    //     System.out.println(admin.getName()+admin.getUserName());
    //     return admin;
    // }


    

}
