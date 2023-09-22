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
@Table(name = "tbl_student")
@AllArgsConstructor
@NoArgsConstructor
public class Student {


    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name ="UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Id
    private  String id;

    private String firstName;
    private String lastName;
    private String telNo;
    private String email;
    @ManyToMany()
    @JoinTable(
            name = "course_taken",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )

    private Set<Course> course;

}
