package com.cinarcorp.StudentClass.dto.converter;

import com.cinarcorp.StudentClass.dto.CourseAllDto;
import com.cinarcorp.StudentClass.dto.CourseDto;
import com.cinarcorp.StudentClass.model.Course;

import java.util.stream.Collectors;

public class CourseAllDtoConverter {
    private  final  StudentDtoConverter studentDtoConverter;
    private  final  TeacherDtoConvert teacherDtoConvert;

    public CourseAllDtoConverter(StudentDtoConverter studentDtoConverter, TeacherDtoConvert teacherDtoConvert) {
        this.studentDtoConverter = studentDtoConverter;
        this.teacherDtoConvert = teacherDtoConvert;
    }
    public CourseAllDto convert(Course from){
        return new CourseAllDto(from.getId(), from.getCourseName(), from.getSection()
                ,teacherDtoConvert.convert(from.getTeacher())
                ,from.getStudent().stream().map(studentDtoConverter::convert).collect(Collectors.toSet()));
    }
}
