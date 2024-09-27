package ru.sevumyan.arsen.adapter.rest;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.sevumyan.arsen.app.api.*;
import ru.sevumyan.arsen.app.impl.CreateEmployeeUseCase;
import ru.sevumyan.arsen.app.impl.GetEmployeesUseCase;
import ru.sevumyan.arsen.domain.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employees")
public class EmployeeController {
    private final CreateEmployeeUseCase createEmployeeUseCase;
    private final GetEmployeesUseCase getEmployeesUseCase;

    @GetMapping
    public List<Employee> getEmployees() {
        return getEmployeesUseCase.getAll();
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return createEmployeeUseCase.create(employee);
    }

    @GetMapping("/without-mentors")
    public List<Employee> getEmployeesWithOutMentors() {
        return getEmployeesUseCase.getAllWithoutMentors();
    }

    @GetMapping(value = "/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id) {
        return getEmployeesUseCase.getById(id);
    }

}
