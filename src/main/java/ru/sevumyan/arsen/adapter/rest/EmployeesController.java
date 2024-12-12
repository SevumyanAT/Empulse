package ru.sevumyan.arsen.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.sevumyan.arsen.adapter.rest.dto.*;
import ru.sevumyan.arsen.app.impl.CreateEmployeeUseCase;
import ru.sevumyan.arsen.app.impl.GetEmployeesUseCase;
import ru.sevumyan.arsen.domain.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employees")
public class EmployeesController {
    private final CreateEmployeeUseCase createEmployeeUseCase;
    private final GetEmployeesUseCase getEmployeesUseCase;
    private final EmployeeMapper employeeMapper;

    @GetMapping
    public List<EmployeeDto> getEmployees(@RequestParam(required = false) Long departmentId) {
        List<Employee> employees = getEmployeesUseCase.getAllByFilters(departmentId);
        return employeeMapper.toEmployeeDtoList(employees);
    }

    @PostMapping
    public EmployeeDto create(@RequestBody EmployeeDto employeedto) {
        Employee newEmployee = employeeMapper.toEmployee(employeedto);
        newEmployee = createEmployeeUseCase.create(newEmployee);
        return employeeMapper.toEmployeeDto(newEmployee);
    }

    @GetMapping("/without-mentors")
    public List<EmployeeDto> getEmployeesWithoutMentors() {
        List<Employee> employees = getEmployeesUseCase.getAllWithoutMentors();
        return employeeMapper.toEmployeeDtoList(employees);
    }

    @GetMapping(value = "/{id}")
    public EmployeeDto getEmployeeById(@PathVariable Long id) {
        Employee employees = getEmployeesUseCase.getById(id);
        return employeeMapper.toEmployeeDto(employees);
    }
}
