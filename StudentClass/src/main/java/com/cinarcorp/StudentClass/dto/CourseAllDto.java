package com.cinarcorp.StudentClass.dto;

import com.cinarcorp.StudentClass.model.Section;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseAllDto {
    private String id;
    private String courseName;
    private Section section;
    private TeacherDto teacher;
    private Set<StudentDto> student;
}
