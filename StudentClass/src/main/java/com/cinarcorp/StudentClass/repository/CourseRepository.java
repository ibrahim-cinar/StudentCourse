package com.cinarcorp.StudentClass.repository;

import com.cinarcorp.StudentClass.model.Course;
import com.cinarcorp.StudentClass.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,String> {
}
