package ru.sevumyan.arsen.adapter.rest.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class WorkingHourDto {
    private Long id;

    private EmployeeDto employee;

    private int workingHours;
}
