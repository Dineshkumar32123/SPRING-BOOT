
package edu.jsp.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.book.dao.BookDao;
import edu.jsp.book.dto.Book;
import edu.jsp.book.service.BookService;


@RestController
public class BookController {
	@Autowired
	private BookService service;
	
	@PostMapping("savebook")
	public Book saveBook(@RequestBody Book b) {
		
		return service.saveBook(b);
		
	}
	

}
