package com.apress.springrecipes.library.service;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.apress.springrecipes.library.domain.Book;
import com.apress.springrecipes.library.domain.BookCriteria;

public class BookServiceImpl implements BookService {

    private Map<String, Book> books;

    public BookServiceImpl() {
        books = new HashMap<String, Book>();
        books.put("0001", new Book("0001", "Spring Framework", "Ray",
                new GregorianCalendar(2007, 0, 1).getTime()));
        books.put("0002", new Book("0002", "Spring Web MVC", "Paul",
                new GregorianCalendar(2007, 3, 1).getTime()));
        books.put("0003", new Book("0003", "Spring Web Flow", "Ray",
                new GregorianCalendar(2007, 6, 1).getTime()));
    }

    public List<Book> search(BookCriteria criteria) {
        List<Book> results = new ArrayList<Book>();
        for (Book book : books.values()) {
            String keyword = criteria.getKeyword().trim();
            String author = criteria.getAuthor().trim();
            boolean keywordMatches = keyword.length() > 0
                    && book.getName().contains(keyword);
            boolean authorMatches = book.getAuthor().equals(author);
            if (keywordMatches || authorMatches) {
                results.add(book);
            }
        }
        return results;
    }

    public Book findByIsbn(String isbn) {
        return books.get(isbn);
    }
}
