package ru.sevumyan.arsen.app.api;

import ru.sevumyan.arsen.domain.Employee;

import java.sql.SQLException;
import java.util.List;

public interface GetEmployeesInbound {
    List<Employee> execute() throws SQLException;
}
