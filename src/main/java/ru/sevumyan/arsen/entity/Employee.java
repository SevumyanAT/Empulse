package ru.sevumyan.arsen.entity;

import lombok.Setter;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class Employee {
    private String firstName;
    private String lastName;
    private String passportNumber;
    private String universityEducation;
    private String birthDate;
    private String bankAccount;
    private String postId;
    private String departmentId;
}
