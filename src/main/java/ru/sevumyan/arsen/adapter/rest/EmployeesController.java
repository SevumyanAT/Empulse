package ru.sevumyan.arsen.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.sevumyan.arsen.adapter.rest.dto.DepartmentDto;
import ru.sevumyan.arsen.adapter.rest.dto.EmployeeDto;
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

    @GetMapping
    public List<EmployeeDto> getEmployees() {
        List<Employee> employees = getEmployeesUseCase.getAll();
        return employees.stream()
                .map(this::createEmployeeDto)
                .toList();
    }

    @PostMapping
    public EmployeeDto create(@RequestBody Employee employee) {
        createEmployeeUseCase.create(employee);
        return createEmployeeDto(employee);
    }

    @GetMapping("/without-mentors")
    public List<EmployeeDto> getEmployeesWithOutMentors() {
        List<Employee> employees = getEmployeesUseCase.getAllWithoutMentors();
        return employees.stream()
                .map(this::createEmployeeDto)
                .toList();
    }

    @GetMapping(value = "/{id}")
    public EmployeeDto getEmployeeById(@PathVariable Long id) {
        Employee employees = getEmployeesUseCase.getById(id);
        return createEmployeeDto(employees);
    }

    @GetMapping(value = "/from")
    public List<EmployeeDto> getByDepartmentId(@RequestParam Long id) {
        List<Employee> employees = getEmployeesUseCase.getByDepartmentId(id);
        return employees.stream()
                .map(this::createEmployeeDto)
                .toList();
    }

    private EmployeeDto createEmployeeDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        DepartmentDto departmentDto = createDepartmentDto(employee.getDepartment());
        employeeDto.setId(employee.getId());
        employeeDto.setFirstName(employee.getFirstName());
        employeeDto.setLastName(employee.getLastName());
        employeeDto.setPassportNumber(employee.getPassportNumber());
        employeeDto.setUniversityEducation(employee.getUniversityEducation());
        employeeDto.setBirthDate(employee.getBirthDate());
        employeeDto.setBankAccount(employee.getBankAccount());
        employeeDto.setPosition(employee.getPosition());
        employeeDto.setDepartment(departmentDto);
        return employeeDto;
    }

    private DepartmentDto createDepartmentDto(Department department) {
        DepartmentDto departmentDto = new DepartmentDto();
        departmentDto.setId(department.getId());
        departmentDto.setDepartmentLocation(department.getDepartmentLocation());
        return departmentDto;
    }
}
