package edu.jsp.demoSpring_app.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping(method = RequestMethod.GET, value = "m1")
	public String m1() {
		return "Hello World...";
	}

	@RequestMapping(method = RequestMethod.GET, value = "m2")
	public String m2() {
		return "This is m2 method...";
	}

	@RequestMapping(method = RequestMethod.GET, value = "m3")
	public Student m3() {
		Student s = new Student();
		s.setName("DINESH");
		s.setAge(22);
		s.setId(03);
		s.setMarks(93);

		return s;
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "m4")
	public List<Student> m4(){
		
		Student s = new Student();
		s.setName("BHARANI");
		s.setId(001);
		s.setAge(22);
		s.setMarks(99.9);
		
		Student s1 = new Student();
		s1.setName("DINESH");
		s1.setId(002);
		s1.setAge(22);
		s1.setMarks(98.8);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s);
		al.add(s1);
		
		return al;
		
	}
	
	
	@RequestMapping(method = RequestMethod.PUT, value = "m5")
	public String[] m5() {
		
		String[] s= {"Hii","I am Human"};
		
		return s;
	}
	
	

}
