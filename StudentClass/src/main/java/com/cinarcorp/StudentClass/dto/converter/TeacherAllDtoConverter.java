package com.cinarcorp.StudentClass.dto.converter;

import com.cinarcorp.StudentClass.dto.TeacherAllDto;
import com.cinarcorp.StudentClass.model.Teacher;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class TeacherAllDtoConverter {
    private final CourseStudentConverter courseStudentConverter;

    public TeacherAllDtoConverter(CourseStudentConverter courseStudentConverter) {
        this.courseStudentConverter = courseStudentConverter;
    }
    public TeacherAllDto convert(Teacher from){
        return new TeacherAllDto(from.getFirstName(), from.getLastName(),
                from.getSection(), from.getTelNo(),from.getEmail(),
                from.getCourses().stream().map(courseStudentConverter::convert)
                .collect(Collectors.toSet()));
    }
}
