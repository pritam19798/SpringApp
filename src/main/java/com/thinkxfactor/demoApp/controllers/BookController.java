package com.thinkxfactor.demoApp.controllers;

import java.util.ArrayList;
import java.util.List;
import com.thinkxfactor.demoApp.entity.Book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping({ "/book" })
public class BookController{
    @GetMapping({ "/addbook" })
    public List<Book> hellobook(@RequestParam("b") String blist) {
        String[] ar = blist.split(",");
        List<Book> bookList = new ArrayList<Book>();
        Book book;
        for (int i = 0; i < ar.length; ++i) {
            String[] b=ar[i].split(":");
            book = new Book(b[0],b[1]);
            bookList.add(book);
        }
        return bookList;
    }
}