package ru.sevumyan.arsen.app.api;

import ru.sevumyan.arsen.domain.Department;

public interface CreateDepartmentInbound {
    Department create(Department department);
}
