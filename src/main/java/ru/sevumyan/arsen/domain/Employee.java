package ru.sevumyan.arsen.domain;

import lombok.Setter;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Getter
@Setter
@Accessors(chain = true)
public class Employee {
    private String firstName;
    private String lastName;
    private String passportNumber;
    private String universityEducation;
    private LocalDate birthDate;
    private String bankAccount;
    private int postId;
    private int departmentId;
}
