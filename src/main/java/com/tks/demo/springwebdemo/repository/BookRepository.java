package com.tks.demo.springwebdemo.repository;

import com.tks.demo.springwebdemo.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface BookRepository {
    void save(Book book);
    List<Book> getAllBooks();
}

