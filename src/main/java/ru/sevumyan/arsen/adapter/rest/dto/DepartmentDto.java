package ru.sevumyan.arsen.adapter.rest.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class DepartmentDto {
    private Long id;

    private String departmentLocation;
}
