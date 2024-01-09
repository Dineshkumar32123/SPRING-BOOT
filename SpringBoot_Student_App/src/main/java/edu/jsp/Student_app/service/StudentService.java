package edu.jsp.Student_app.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.Student_app.dao.StudentDao;
import edu.jsp.Student_app.dto.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentdao;
	
	
	public Student saveStudent(Student s) {
		
		return studentdao.saveStudent(s);
		
	}
	public List<Student> fetchAll(){
		return studentdao.fetchAll();
	}
	
	public Student fetchById(int studentId) {
		return studentdao.fetchById(studentId);
	}
	
	public Student fetchByName(String StudentName) {
		return studentdao.fetchByName(StudentName);
	}
	
	public String deleteById(int studentId) {
		return studentdao.deleteById(studentId);
	}
	public Student updateStudent(int studentId,Student s) {
		Student s1 =studentdao.fetchById(studentId);
		if(s1!=null) {
			s.setStudentId(studentId);
			return studentdao.updateStudent(s);
		}
		return null;
	}

}
