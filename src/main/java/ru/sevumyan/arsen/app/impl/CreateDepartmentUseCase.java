package ru.sevumyan.arsen.app.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sevumyan.arsen.app.api.CreateDepartmentInbound;
import ru.sevumyan.arsen.app.api.DepartmentRepository;
import ru.sevumyan.arsen.domain.Department;

@Service
@Transactional
@RequiredArgsConstructor
public class CreateDepartmentUseCase implements CreateDepartmentInbound {
    private final DepartmentRepository departmentRepository;

    @Override
    public Department create(Department department) {
        return departmentRepository.save(department);
    }
}
