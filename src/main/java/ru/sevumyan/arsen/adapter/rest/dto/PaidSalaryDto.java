package ru.sevumyan.arsen.adapter.rest.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@RequiredArgsConstructor
public class PaidSalaryDto {
    private Long id;

    private EmployeeDto employee;

    private LocalDate paymentDate;

    private String bankAccount;
}
