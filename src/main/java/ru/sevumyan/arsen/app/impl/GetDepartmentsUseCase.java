package ru.sevumyan.arsen.app.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sevumyan.arsen.app.api.DepartmentRepository;
import ru.sevumyan.arsen.app.api.GetDepartmentsInbound;
import ru.sevumyan.arsen.domain.Department;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetDepartmentsUseCase implements GetDepartmentsInbound {
    private final DepartmentRepository departmentRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Department> getAll() {
        return departmentRepository.findAll();
    }
}
