package edu.jsp.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jsp.book.dto.Book;

public interface BookRepo extends JpaRepository<Book,Integer>{

}
