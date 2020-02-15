package com.thinkxfactor.demoApp.repository;

import com.thinkxfactor.demoApp.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long>{

}