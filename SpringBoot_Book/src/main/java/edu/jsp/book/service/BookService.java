package edu.jsp.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import edu.jsp.book.dao.BookDao;
import edu.jsp.book.dto.Book;

@Service
public class BookService {

	
	@Autowired
	private BookDao dao;
	
	public Book saveBook(Book b) {
		
		return dao.saveBook(b);
		
	}

}
