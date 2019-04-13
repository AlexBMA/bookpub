package com.example.bookpub.formatter;

import com.example.bookpub.entity.Book;
import com.example.bookpub.repository.BookRepository;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class BookFormatter implements Formatter<Book> {

    private BookRepository bookRepository;

    public BookFormatter(BookRepository repository) {
        this.bookRepository = repository;
    }

    @Override
    public Book parse(String bookIdentifier, Locale locale) throws ParseException {
        Book book = bookRepository.findDistinctByIsbn(bookIdentifier);

        return book != null ? book : bookRepository.findById(Long.valueOf(bookIdentifier)).get();
    }

    @Override
    public String print(Book book, Locale locale) {
        return book.getIsbn();
    }
}
