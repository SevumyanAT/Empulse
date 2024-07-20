package ru.sevumyan.arsen.entity;

import lombok.Setter;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class Employee {
    private String firstName;
    private String lastName;
    private int passportNumber;
    private String universityEducation;
    private String birthDate;
    private int bankAccount;
    private int postId;
    private int departmentId;
}
