package com.cinarcorp.StudentClass.dto.converter;

import com.cinarcorp.StudentClass.dto.TeacherDto;
import com.cinarcorp.StudentClass.model.Teacher;
import org.springframework.stereotype.Component;

@Component
public class TeacherDtoConvert {
    public TeacherDto convert(Teacher from){
        return new TeacherDto(from.getFirstName(), from.getLastName(), from.getSection(),from.getTelNo(), from.getEmail());
    }
}
