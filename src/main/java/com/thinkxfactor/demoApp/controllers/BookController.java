package com.thinkxfactor.demoApp.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.thinkxfactor.demoApp.entity.Book;
import com.thinkxfactor.demoApp.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping({ "/book" })
public class BookController{

    @Autowired
    BookRepository bookRepository;

    @GetMapping({ "/addbook" })
    public List<Book> addbook(@RequestParam("b") String blist) {
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
    @GetMapping({"/listbook"})
    public List<Book> listbook(){
        List<Book> BookList = new ArrayList<Book>();
        Book book = new Book("c","A_1","c1234","prog");
        BookList.add(book);
        book = new Book("c++","A_2","cpp1234","prog");
        BookList.add(book);
        book = new Book("java","A_3","j1234","prog");
        BookList.add(book);
        book = new Book("python","A_4","p1234","prog");
        BookList.add(book);
        book = new Book("spring","A_5","s1234","prog");
        BookList.add(book);
        return BookList;
    }
    @GetMapping({ "/bookobject" })
    public Book hello(@RequestParam("n")  String b) {
        String[] ar=b.split(",");
        Book book = new Book(ar[0],ar[1],ar[2],ar[3]);
        return book;
    }


    @GetMapping({"/get"})
    public Book get(@RequestParam Long id){
        Optional<Book> byId=bookRepository.findById(id);
        return byId.get();
    }

    @PostMapping({"/add"})
    public Book add(@RequestBody Book book){
        Book persistenceBook=bookRepository.saveAndFlush(book);
        return persistenceBook;
    }
}