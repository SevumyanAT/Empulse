package ru.sevumyan.arsen.adapter.persistence;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.sevumyan.arsen.app.api.DepartmentRepository;
import ru.sevumyan.arsen.domain.Department;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DepartmentRepositoryAdapter implements DepartmentRepository {
    private final DepartmentJpaRepository departmentJpaRepository;

    @Override
    public List<Department> findAll() {
        return departmentJpaRepository.findAll();
    }
}
