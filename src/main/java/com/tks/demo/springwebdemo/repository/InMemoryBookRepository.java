package com.tks.demo.springwebdemo.repository;

import com.tks.demo.springwebdemo.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBookRepository implements BookRepository{

    private List<Book> bookList = new ArrayList<>();
    @Override
    public void save( Book book )
    {
        bookList.add(book);
    }

    @Override
    public List<Book> getAllBooks()
    {
        return bookList;
    }

}
