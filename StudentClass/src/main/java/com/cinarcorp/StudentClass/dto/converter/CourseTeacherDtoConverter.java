package com.cinarcorp.StudentClass.dto.converter;

import com.cinarcorp.StudentClass.dto.CourseTeacherDto;
import com.cinarcorp.StudentClass.model.Course;
import org.springframework.stereotype.Component;

@Component
public class CourseTeacherDtoConverter {
    private  final  TeacherDtoConvert teacherDtoConvert;

    public CourseTeacherDtoConverter(TeacherDtoConvert teacherDtoConvert) {
        this.teacherDtoConvert = teacherDtoConvert;
    }
    public CourseTeacherDto convert(Course from){
        return new CourseTeacherDto(from.getId(), from.getCourseName(),
                from.getSection(),teacherDtoConvert.convert(from.getTeacher()));
    }
}
