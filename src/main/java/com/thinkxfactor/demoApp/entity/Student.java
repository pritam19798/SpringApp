package com.thinkxfactor.demoApp.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private int age;
    private int roll;
    private String gender;
    private String dept;

    public Student(){
        
    }

    public Student(String n,int a,int r,String g,String d){
		name=n;
		age=a;
		roll=r;
		gender=g;
		dept=d;
	}

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}