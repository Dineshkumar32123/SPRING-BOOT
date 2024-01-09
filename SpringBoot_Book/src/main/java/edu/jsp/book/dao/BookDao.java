package edu.jsp.book.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.jsp.book.dto.Book;
import edu.jsp.book.repository.BookRepo;


@Repository
public class BookDao {
	
	@Autowired
	private BookRepo repo;
	
	public Book saveBook(Book b) {
		
		return repo.save(b);
		
	}

}
