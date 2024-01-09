package edu.jsp.Student_app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jsp.Student_app.dto.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

	public Optional<Student> findByName(String studentName);
}
