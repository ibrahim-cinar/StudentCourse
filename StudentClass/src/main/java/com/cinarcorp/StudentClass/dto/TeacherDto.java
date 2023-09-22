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
public class TeacherDto {
    private String firstName;
    private String lastName;
    private Section section;
    private String telNo;
    private String email;

}