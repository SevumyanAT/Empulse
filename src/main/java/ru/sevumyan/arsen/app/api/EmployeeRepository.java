package ru.sevumyan.arsen.app.api;

import ru.sevumyan.arsen.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {
    List<Employee> findAll();

    Employee save(Employee employee);

    List<Employee> findEmployeesWithoutMentors();

    Optional<Employee> findById(Long id);
}
