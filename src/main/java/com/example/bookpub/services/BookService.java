package com.example.bookpub.services;


import com.example.bookpub.entity.Book;
import com.example.bookpub.model.Isbn;
import com.example.bookpub.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBook(Isbn isbn) {
        return bookRepository.findDistinctByIsbn(isbn.toString());
    }
}
