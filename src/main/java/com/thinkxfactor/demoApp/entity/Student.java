package com.thinkxfactor.demoApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_student")
public class Student {
    @Id
    @GeneratedValue
    @Column(name="student_id")
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="dept")
    private String dept;

    public Student() {

    }

    public Student(String n, String u, String p, String d) {
		name=n;
        dept=d;
        username=u;
        password=p;
	}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}