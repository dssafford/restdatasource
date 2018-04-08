package com.doug.service;


import com.doug.model.Book;
import com.doug.model.BookCategory;

public interface BookService {

    Iterable<Book> getAllBooks();

    Iterable<BookCategory> getAllBookCategories();
}
