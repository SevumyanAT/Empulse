package ru.sevumyan.arsen.app.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sevumyan.arsen.app.api.DepartmentRepository;
import ru.sevumyan.arsen.app.api.GetDepartmentsInbound;
import ru.sevumyan.arsen.domain.Department;
import ru.sevumyan.arsen.domain.Employee;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GetDepartmentsUseCase implements GetDepartmentsInbound {
    private final DepartmentRepository departmentRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Department> getAll() {
        return departmentRepository.findAll();
    }

  //  @Override
  //  @Transactional(readOnly = true)
  //  public Optional<Department> getAllEmployeesFromDepartment(Long id) {
  //      return departmentRepository.findAllEmployeesById(id);
  //  }
}
