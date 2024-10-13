package ru.sevumyan.arsen.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.sevumyan.arsen.domain.Employee;

import java.util.List;

public interface EmployeeJpaRepository extends JpaRepository<Employee, Long> {
    List<Employee> findAllByMentorIsNull();

    List<Employee> findByDepartmentId(Long id);
}

