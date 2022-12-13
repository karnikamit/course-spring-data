package io.springworks.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.springworks.models.Student;

@Service
public class StudentService {

	private List<Student> students = new ArrayList();

	public List<Student> getStudents() {
		return students;
	}

	public Student getStudent(String name) {
		return students.stream()
				.filter(stu -> stu.getName().equals(name))
				.findFirst().get();
	}

	public void addStudent(Student student) {
		if(student != null) {
			students.add(student);
		}
	}
}
