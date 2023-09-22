package com.cinarcorp.StudentClass.dto.converter;

import com.cinarcorp.StudentClass.dto.StudentDto;
import com.cinarcorp.StudentClass.model.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentDtoConverter {
    public StudentDto convert(Student from){
        return new StudentDto(from.getFirstName(), from.getLastName(), from.getTelNo(), from.getEmail());
    }
}
