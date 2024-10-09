package ru.sevumyan.arsen.app.api;

import ru.sevumyan.arsen.domain.Department;

import java.util.List;

public interface GetDepartmentsInbound {
    List<Department> getAll();
}
