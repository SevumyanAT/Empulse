package ru.sevumyan.arsen.adapter.rest.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@RequiredArgsConstructor
public class EmployeeDto {
    private Long id;

    private String firstName;

    private String lastName;

    private String passportNumber;

    private String universityEducation;

    private LocalDate birthDate;

    private String bankAccount;

    private EmployeeDto mentor;

    private PositionDto position;

    private DepartmentDto department;
}
