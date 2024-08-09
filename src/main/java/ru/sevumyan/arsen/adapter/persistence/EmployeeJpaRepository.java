package ru.sevumyan.arsen.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sevumyan.arsen.domain.Employee;

public interface EmployeeJpaRepository extends JpaRepository<Employee, Long> {
}

