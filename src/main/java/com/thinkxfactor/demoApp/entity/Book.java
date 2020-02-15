package com.thinkxfactor.demoApp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "tbl_book")
public class Book {
    @Id
    @GeneratedValue
    @Column(name="book_id")
    private long id;

    @Column(name="name")
    private String name;
    
    @Column(name="author")
    private String author;

    @Column(name="isbn_number")
    private String isbn_number;

    @Column(name="category")
    private String category;

    public Book() {

    }



    public Book(String name, String author) {
        this.name=name;
        this.author=author;
    }
    public Book(String name,String author,String isbn_number,String category){
        this.name=name;
        this.author=author;
        this.isbn_number=isbn_number;
        this.category=category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public String getIsbn_number() {
        return isbn_number;
    }

    public void setIsbn_number(String isbn_number) {
        this.isbn_number = isbn_number;
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