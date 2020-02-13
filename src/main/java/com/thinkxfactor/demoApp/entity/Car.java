package com.thinkxfactor.demoApp.entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String name;
    private String model;
    @Autowired
    private Engine engine;

    public Car(){
        System.out.println("car created");
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printInfo(){
        System.out.println(this.name+this.model+this.engine);
    }


}


