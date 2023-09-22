package com.cinarcorp.StudentClass.repository;

import com.cinarcorp.StudentClass.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student,String> {
}
