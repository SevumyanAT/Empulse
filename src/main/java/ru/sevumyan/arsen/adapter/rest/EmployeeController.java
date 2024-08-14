package ru.sevumyan.arsen.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sevumyan.arsen.adapter.persistence.NewEntityOfEmployee;
import ru.sevumyan.arsen.app.api.*;
import ru.sevumyan.arsen.domain.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/home")
public class EmployeeController {
    private final EmployeeRepository employeeRepository;
    private final PositionsRepository positionsRepository;
    private final WorkingHoursRepository workingHoursRepository;
    private final DepartmentRepository departmentRepository;
    private final PaidSalaryRepository paidSalaryRepository;
    private final AbsenceRepository absenceRepository;
    private final NewEntityOfEmployee employee;

    @GetMapping("/employees")
    public List<Employee> getEmployee() throws SQLException {
        return employeeRepository.findAll();
    }

    @GetMapping("/positions")
    public List<Position> getPositions() throws SQLException {
        return positionsRepository.findAll();
    }

    @GetMapping("/absence")
    public List<Absence> getAbsence() throws SQLException {
        return absenceRepository.findAll();
    }

    @GetMapping("/paidsalary")
    public List<PaidSalary> getPaidSalary() throws SQLException {
        return paidSalaryRepository.findAll();
    }

    @GetMapping("/workinghours")
    public List<WorkingHours> getWorkingHours() throws SQLException {
        return workingHoursRepository.findAll();
    }

    @GetMapping("/department")
    public List<Department> getDepartment(){
        return departmentRepository.findAll();
    }

    @GetMapping("/newemployee")
    public void insertOrUpdate(){
        employeeRepository.updateOrInsert(employee.newEmployee());
    }

}
