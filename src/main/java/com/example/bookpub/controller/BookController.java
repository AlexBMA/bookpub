package com.example.bookpub.controller;


import com.example.bookpub.entity.Book;
import com.example.bookpub.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{isbn}", method = RequestMethod.GET)
    public ResponseEntity<Book> getBook(@PathVariable String isbn) {
        return new ResponseEntity<>(bookService.getBook(isbn), HttpStatus.OK);
    }

}
