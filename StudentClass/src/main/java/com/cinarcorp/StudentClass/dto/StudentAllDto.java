package com.cinarcorp.StudentClass.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentAllDto {
    private String firstName;
    private String lastName;
    private String telNo;
    private String email;
    private Set<CourseTeacherDto> courseTeacher;

}