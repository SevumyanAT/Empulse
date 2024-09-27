package ru.sevumyan.arsen.app.api;

import ru.sevumyan.arsen.domain.Employee;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface GetEmployeesInbound {
    List<Employee> getAll();

    List<Employee> getAllWithoutMentors();

    Optional<Employee> getById(Long id);
}
