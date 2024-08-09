package ru.sevumyan.arsen.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sevumyan.arsen.app.api.EmployeeRepository;
import ru.sevumyan.arsen.app.api.PositionsRepository;
import ru.sevumyan.arsen.domain.Employee;
import ru.sevumyan.arsen.domain.Position;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/home")
public class EmployeeController {
    private final EmployeeRepository employeeRepository;
    private final PositionsRepository positionsRepository;

    @GetMapping("/employees")
    public List<Employee> getEmployee() throws SQLException {
        return employeeRepository.findAll();
    }

    @GetMapping("/positions")
    public List<Position> getPositions() throws SQLException {
        return positionsRepository.findAll();
    }

}
