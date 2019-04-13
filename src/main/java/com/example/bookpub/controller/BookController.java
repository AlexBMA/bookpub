package com.example.bookpub.controller;


import com.example.bookpub.editors.IsbnEditor;
import com.example.bookpub.entity.Book;
import com.example.bookpub.model.Isbn;
import com.example.bookpub.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Isbn.class, new IsbnEditor());
    }

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{isbn}", method = RequestMethod.GET)
    public ResponseEntity<Book> getBook(@PathVariable Isbn isbn) {
        return new ResponseEntity<>(bookService.getBook(isbn.toString()), HttpStatus.OK);
    }

}
