package ru.sevumyan.arsen.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.sevumyan.arsen.app.api.*;
import ru.sevumyan.arsen.domain.*;

import java.awt.*;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employee")
public class EmployeeController {
    private final EmployeeRepository employeeRepository;

    @GetMapping("/getemployees")
    public List<Employee> getEmployee() throws SQLException {
        return employeeRepository.findAll();
    }

    @PostMapping(value = "/newemployee",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> insertOrUpdate(@RequestBody Employee employee) {
        Employee employee1 = employeeRepository.save(employee);
        return new ResponseEntity<>(employee1, HttpStatus.CREATED);
    }

}
