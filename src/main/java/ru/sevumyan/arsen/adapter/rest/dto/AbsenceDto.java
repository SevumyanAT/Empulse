package ru.sevumyan.arsen.adapter.rest.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@RequiredArgsConstructor
public class AbsenceDto {
    private Long id;

    private EmployeeDto employee;

    private LocalDate absenceDate;

    private String bankAccount;

    private String cause;
}
