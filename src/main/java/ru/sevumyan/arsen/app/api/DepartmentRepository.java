package ru.sevumyan.arsen.app.api;

import ru.sevumyan.arsen.domain.Department;
import ru.sevumyan.arsen.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepository {
    List<Department> findAll();

  //  Optional<Department> findAllEmployeesById(Long id);
}
