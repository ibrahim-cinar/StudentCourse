package com.cinarcorp.StudentClass.dto;

import com.cinarcorp.StudentClass.model.Section;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseTeacherDto {
    private String id;
    private String courseName;
    private Section section;
    private TeacherDto teacher;

}