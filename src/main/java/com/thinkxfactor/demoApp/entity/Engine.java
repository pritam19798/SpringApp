package com.thinkxfactor.demoApp.entity;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String modelNumber = "1234";
    private String name="model terbo";

    public Engine()
    {
        System.out.println("Engine created");
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }
}