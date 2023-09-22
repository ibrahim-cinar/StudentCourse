package com.cinarcorp.StudentClass.repository;

import com.cinarcorp.StudentClass.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,String> {
}
