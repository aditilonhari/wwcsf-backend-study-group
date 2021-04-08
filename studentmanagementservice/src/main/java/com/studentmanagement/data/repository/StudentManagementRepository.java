package com.studentmanagement.data.repository;

import com.studentmanagement.data.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentManagementRepository extends CrudRepository<Student, Long> {

}