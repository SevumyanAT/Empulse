package ru.sevumyan.arsen.adapter.rest.dto;

import org.mapstruct.*;
import ru.sevumyan.arsen.domain.Employee;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DepartmentMapper.class, PositionMapper.class})
public interface EmployeeMapper {
    @Mapping(source = "mentor", target = "mentor", ignore = true)
    EmployeeDto toEmployeeDto(Employee employee);

    List<EmployeeDto> toEmployeeDtoList(List<Employee> employees);
}
