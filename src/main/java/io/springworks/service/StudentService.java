package io.springworks.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.springworks.models.Student;
import io.springworks.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studenRepo;

	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		studenRepo.findAll()
		.forEach(students::add);
		return students;
	}

//	public Student getStudent(String name) {
//		return students.stream()
//				.filter(stu -> stu.getName().equals(name))
//				.findFirst().get();
//	}
//
	public void addStudent(Student student) {
		if(student != null) {
			studenRepo.save(student);
		}
	}
}
