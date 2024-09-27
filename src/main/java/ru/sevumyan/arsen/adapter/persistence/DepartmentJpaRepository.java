package ru.sevumyan.arsen.adapter.persistence;

import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.sevumyan.arsen.domain.Department;
import ru.sevumyan.arsen.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface DepartmentJpaRepository extends JpaRepository<Department, Long> {

  //  @Query(value = "SELECT e FROM Department e JOIN FETCH e.employees WHERE e.id = :id")
  //  Optional<Department> findEmployeesByDepartment(Long id);
}
