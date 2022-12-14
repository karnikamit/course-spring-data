package io.springworks.repository;

import org.springframework.data.repository.CrudRepository;

import io.springworks.models.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
