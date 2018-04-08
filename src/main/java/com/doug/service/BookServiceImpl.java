package com.doug.service;

import com.doug.model.Book;
import com.doug.model.BookCategory;
import com.doug.model.Location;
import com.doug.repository.BookCategoryRepository;
import com.doug.repository.BookRepository;
import com.doug.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookCategoryRepository bookCategoryRepository;

    @Override
    public Iterable<Book> getAllBooks() {


        return bookRepository.findAll();
    }

    @Override
    public Iterable<BookCategory> getAllBookCategories() {

        return bookCategoryRepository.findAll();
    }


}
