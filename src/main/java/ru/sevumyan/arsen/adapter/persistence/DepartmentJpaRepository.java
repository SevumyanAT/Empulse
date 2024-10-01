package ru.sevumyan.arsen.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sevumyan.arsen.domain.Department;

public interface DepartmentJpaRepository extends JpaRepository<Department, Long> {
}
