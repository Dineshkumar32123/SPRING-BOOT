package edu.jsp.Student_app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.jsp.Student_app.dto.Student;
import edu.jsp.Student_app.repository.StudentRepo;

@Repository
public class StudentDao {

	@Autowired
	private StudentRepo studentrepo;
	
	public Student saveStudent(Student s) {
		return studentrepo.save(s);
	}
	public List<Student> fetchAll() {
		
		return studentrepo.findAll();
		
	}
	public Student fetchById(int studentId) {
		Optional<Student> o = studentrepo.findById(studentId);
		return o.get();
	}
	public Student fetchByName(String StudentName) {
		Optional <Student> o = studentrepo.findByName(StudentName);
		return o.get();
	}
	
	public String deleteById(int studentId) {
		studentrepo.deleteById(studentId);
		return "Deleted...";
	}
	public Student updateStudent(Student s) {
		return studentrepo.save(s);
	}
}
