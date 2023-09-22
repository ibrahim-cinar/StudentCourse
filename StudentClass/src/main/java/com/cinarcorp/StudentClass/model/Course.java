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
@Table(name = "tbl_course")
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name ="UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Id
    private String id;
    private String courseName;
    private Section section;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "teacher_id",nullable = false)
    private Teacher teacher;

    @ManyToMany(mappedBy = "course")
    private Set<Student> student;



}
