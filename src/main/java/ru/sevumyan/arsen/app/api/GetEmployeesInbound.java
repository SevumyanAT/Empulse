package ru.sevumyan.arsen.app.api;

import ru.sevumyan.arsen.domain.Employee;

import java.util.List;

public interface GetEmployeesInbound {
    List<Employee> getAllWithoutMentors();

    Employee getById(Long id);

    List<Employee> getAllByFilters(Long departmentId);
}
