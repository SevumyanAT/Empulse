package ru.sevumyan.arsen.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.sevumyan.arsen.domain.Employee;

import java.util.List;

public interface EmployeeJpaRepository extends JpaRepository<Employee, Long> {

    @Query(value = "select * from employee where mentor_id is null",
            nativeQuery = true)
    List<Employee> findEmployeesWithoutMentors();

    @Query(value = "select * from employee where department_id = :id",
            nativeQuery = true)
    List<Employee> findEmployeesFromDepartment(Long id);
}

