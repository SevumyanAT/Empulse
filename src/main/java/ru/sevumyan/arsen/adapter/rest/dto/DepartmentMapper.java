package ru.sevumyan.arsen.adapter.rest.dto;

import org.mapstruct.Mapper;
import ru.sevumyan.arsen.domain.Department;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
    DepartmentDto toDepartmentDto(Department department);

    List<DepartmentDto> toDepartmentDtoList(List<Department> departments);
}
