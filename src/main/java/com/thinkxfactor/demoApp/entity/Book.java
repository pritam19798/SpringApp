package com.thinkxfactor.demoApp.entity;

import org.springframework.stereotype.Component;

@Component
public class Book {
    private String name;
    private String author;

    public Book(){

    }
    public Book(String name){
        this.name=name;
    }
    public Book(String name,String author){
        this.name=name;
        this.author=author;
    }
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }
}