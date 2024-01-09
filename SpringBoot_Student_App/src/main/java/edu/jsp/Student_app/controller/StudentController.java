package edu.jsp.Student_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.Student_app.dto.Student;
import edu.jsp.Student_app.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("saveStudent")
	public Student saveStudent(@RequestBody  Student s) {
		
		return studentservice.saveStudent(s);
	}
	
	@GetMapping("fetchAll")
	public List<Student> fetchAll(){
		return studentservice.fetchAll();
	}
	
	@GetMapping("fetchById")
	public Student fetchById(@RequestParam int studentId) {
		return studentservice.fetchById(studentId);
	}
	
	@GetMapping("fetchByName")
	public Student fetchByName(@RequestParam String StudentName) {
		return studentservice.fetchByName(StudentName);
	}

	@DeleteMapping("deleteById/{id}")
	public String deleteById(@PathVariable   int studentId) {
		return studentservice.deleteById(studentId);
	}
	
	@PutMapping("update")
	public Student updateStudent(@RequestParam   int studentId,@RequestBody   Student s) {
		
		return studentservice.updateStudent(studentId,s);
	}
}
