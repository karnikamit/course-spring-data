package io.springworks.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.springworks.models.Student;
import io.springworks.service.StudentService;

@RestController
public class SchoolController {

	private static Logger logger = LoggerFactory.getLogger(SchoolController.class);

	@Autowired
	private StudentService studentService;

	@GetMapping("/hello")
	public String greet() {
		logger.info("Greetings...");
		return "Hello, students!";
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return studentService.getStudents();
	}

	@GetMapping("/students/{name}")
	public Student getStudent(@PathVariable String name) {
		return studentService.getStudent(name);
	}

	@PostMapping("/student")
	public HttpStatus addStudent(@RequestBody Student student) {
		logger.info("Received request body Student: {}", student.toString());
		studentService.addStudent(student);
		return HttpStatus.OK;
	}
}
