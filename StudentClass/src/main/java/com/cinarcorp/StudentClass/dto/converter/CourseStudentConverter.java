package com.cinarcorp.StudentClass.dto.converter;
import com.cinarcorp.StudentClass.dto.CourseStudentDto;
import com.cinarcorp.StudentClass.model.Course;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class CourseStudentConverter {
    private final  StudentDtoConverter studentDtoConverter;

    public CourseStudentConverter(StudentDtoConverter studentDtoConverter) {
        this.studentDtoConverter = studentDtoConverter;
    }

    public CourseStudentDto convert(Course from){
        return new CourseStudentDto(from.getId(), from.getCourseName(),
                from.getSection(),from.getStudent().stream()
                .map(studentDtoConverter::convert).collect(Collectors.toSet()));
    }
}
