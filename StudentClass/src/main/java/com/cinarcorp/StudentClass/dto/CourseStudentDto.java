package com.cinarcorp.StudentClass.dto;

import com.cinarcorp.StudentClass.model.Section;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseStudentDto {
    private String id;
    private String courseName;
    private Section section;
    private Set<StudentDto> student;

}