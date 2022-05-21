package com.tks.demo.springwebdemo.repository;

import com.tks.demo.springwebdemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

}

