package com.apress.springrecipes.library.service;

import java.util.List;

import com.apress.springrecipes.library.domain.Book;
import com.apress.springrecipes.library.domain.BookCriteria;

public interface BookService {

    public List<Book> search(BookCriteria criteria);
    public Book findByIsbn(String isbn);
}
