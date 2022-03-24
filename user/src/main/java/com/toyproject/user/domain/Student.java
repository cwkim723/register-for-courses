package com.toyproject.user.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table
@Getter
@Setter
public class Student {

    @Id @GeneratedValue
    private Long id;

    @Column(name = "student_id")
    @NotEmpty
    private String studentId; // 학번

    @NotEmpty
    private String password;

    @NotEmpty
    private String name;

    @NotEmpty
    private String department; // 학부

    @NotEmpty
    private String major; // 학과

    @NotEmpty
    private int grade; // 학년

    @NotEmpty
    private int semester; // 학기

}
