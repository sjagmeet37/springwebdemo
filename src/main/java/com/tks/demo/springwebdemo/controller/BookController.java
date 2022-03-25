package com.tks.demo.springwebdemo.controller;

import com.tks.demo.springwebdemo.model.Book;
import com.tks.demo.springwebdemo.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    //constructor injection doesn't require @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping
    public Book createBook(@RequestBody Book book){
        bookService.saveBook(book);
        return book;
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return bookService. getAllBooks();
    }
}
