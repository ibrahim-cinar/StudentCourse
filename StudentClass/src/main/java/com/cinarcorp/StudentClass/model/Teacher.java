package com.cinarcorp.StudentClass.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.Set;

@Data
@Builder
@Entity
@Table(name = "tbl_teacher")
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name ="UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Id
    private  String id;
    private  String firstName;
    private  String lastName;
    private  Section section;
    private String telNo;
    private String email;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "teacher")
    private Set<Course> courses;

}
