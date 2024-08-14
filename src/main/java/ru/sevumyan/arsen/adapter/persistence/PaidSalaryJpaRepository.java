package ru.sevumyan.arsen.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sevumyan.arsen.domain.Employee;
import ru.sevumyan.arsen.domain.PaidSalary;

public interface PaidSalaryJpaRepository extends JpaRepository<PaidSalary, Long> {
}
