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

	public Student getStudent(int rollNum) {
		return studenRepo.findOne(rollNum);
	}

	public void addStudent(Student student) {
		if(student != null) {
			studenRepo.save(student);
		}
	}

	/**
	 * Method to update student details
	 * we still use *repo.save() as it save and updates records using bk
	 * @param student
	 */
	public void updateStuden(Student student) {
		studenRepo.save(student);
	}
}
