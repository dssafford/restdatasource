package com.doug.controller;

import com.doug.model.Book;
import com.doug.model.BookCategory;
import com.doug.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by Doug on 1/22/17.
 */



@RestController
public class BookController {


	@Autowired
	BookService bookService;


	@RequestMapping("/xdude")
	public String xgetDude() {

		return "dude";
	}


//	@RequestMapping("/api/location")
//	public @ResponseBody
//	String locations() {
//		return "Hello Fucker";
//	}
//
//	@RequestMapping("/api/greeting1")
//	public @ResponseBody
//	String greeting1() {
//		return "Hello Fucker";
//	}
//
//
//	@RequestMapping("/doug")
//	public String getDoug() {
//		return "index";
//	}



	@CrossOrigin
    @RequestMapping(value = "/api/bookList", method = RequestMethod.GET)
    public Iterable list() {


        Iterable<Book> myBooks = bookService.getAllBooks();

//        model.addAttribute("books", myBooks);

        return myBooks;
    }

	@CrossOrigin
	@RequestMapping(value = "/api/bookCategoryList", method = RequestMethod.GET)
	public Iterable catlist() {


		Iterable<BookCategory> myBookCategories = bookService.getAllBookCategories();

//        model.addAttribute("books", myBooks);

		return myBookCategories;
	}

}
