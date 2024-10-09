package ru.sevumyan.arsen.app.api;

import ru.sevumyan.arsen.domain.Employee;

public interface CreateEmployeeInbound {
    Employee create(Employee employee);
}
