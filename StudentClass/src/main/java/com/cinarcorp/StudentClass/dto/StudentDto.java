package com.cinarcorp.StudentClass.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDto {
    private String firstName;
    private String lastName;
    private String telNo;
    private String email;

}
