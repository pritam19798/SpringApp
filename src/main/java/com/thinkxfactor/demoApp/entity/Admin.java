package com.thinkxfactor.demoApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_admin")
public class Admin {
    @Id
    @GeneratedValue
    @Column(name="admin_id")
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="username")
    private String userName;

    @Column(name="password")
    private String password;

    public Admin() {

    }



    public Admin(String name)
    {
        this.name=name;
    }
    public Admin(String name,String userName,String password){
        this.name=name;
        this.userName=userName;
        this.password=password;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setName(String name) {
        this.name = name;
    }
}