package ru.sevumyan.arsen.adapter.persistence;

import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.sevumyan.arsen.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeJpaRepository extends JpaRepository<Employee, Long> {

    @Query(value = "select * from employee where mentor_id is null",
            nativeQuery = true)
    List<Employee> findEmployeesWithoutMentors();

  // @Query(value = "SELECT e FROM Employee e JOIN FETCH e.mentor WHERE e.id = :id")
    Optional<Employee> findEmployeeById(Long id);
}

