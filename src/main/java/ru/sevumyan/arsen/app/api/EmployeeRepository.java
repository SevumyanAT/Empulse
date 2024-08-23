package ru.sevumyan.arsen.app.api;

import ru.sevumyan.arsen.domain.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> findAll();

    Employee save(Employee employee);
}
