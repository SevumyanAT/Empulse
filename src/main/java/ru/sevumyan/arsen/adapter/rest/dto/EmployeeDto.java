package ru.sevumyan.arsen.adapter.rest.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.sevumyan.arsen.domain.Department;
import ru.sevumyan.arsen.domain.Employee;
import ru.sevumyan.arsen.domain.Position;

import java.time.LocalDate;

@RequiredArgsConstructor
@Getter
@Setter
public class EmployeeDto {
    private Long id;

    private String firstName;

    private String lastName;

    private String passportNumber;

    private String universityEducation;

    private LocalDate birthDate;

    private String bankAccount;

    private Employee mentor;

    private Position position;

    private DepartmentDto department;
}
