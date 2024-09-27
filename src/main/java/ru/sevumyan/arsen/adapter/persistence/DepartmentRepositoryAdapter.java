package ru.sevumyan.arsen.adapter.persistence;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.sevumyan.arsen.app.api.DepartmentRepository;
import ru.sevumyan.arsen.domain.Department;
import ru.sevumyan.arsen.domain.Employee;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DepartmentRepositoryAdapter implements DepartmentRepository {
    private final DepartmentJpaRepository departmentJpaRepository;

    @Override
    public List<Department> findAll() {
        return departmentJpaRepository.findAll();
    }

  // @Override
  // public Optional<Department> findAllEmployeesById(Long id) {
  //     return departmentJpaRepository.findEmployeesByDepartment(id);
  // }
}
