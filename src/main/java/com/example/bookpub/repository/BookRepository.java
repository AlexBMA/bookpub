package com.example.bookpub.repository;

import com.example.bookpub.entity.Book;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends PagingAndSortingRepository<Book, Long> {
    Book findBookByIsbn(String isbn);

    List<Book> findAll();
}
