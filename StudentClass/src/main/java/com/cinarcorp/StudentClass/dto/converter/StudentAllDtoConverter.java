package com.cinarcorp.StudentClass.dto.converter;

import com.cinarcorp.StudentClass.dto.CourseTeacherDto;
import com.cinarcorp.StudentClass.dto.StudentAllDto;
import com.cinarcorp.StudentClass.model.Student;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class StudentAllDtoConverter {
    private final CourseTeacherDtoConverter courseTeacherDtoConverter;

    public StudentAllDtoConverter(CourseTeacherDtoConverter courseTeacherDtoConverter) {
        this.courseTeacherDtoConverter = courseTeacherDtoConverter;
    }
    public StudentAllDto convert(Student from){
        return new StudentAllDto(from.getFirstName(), from.getLastName(), from.getTelNo()
                , from.getEmail(), from.getCourse().stream()
                .map(courseTeacherDtoConverter::convert).collect(Collectors.toSet()));
    }
}
