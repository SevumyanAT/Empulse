package ru.sevumyan.arsen.adapter.persistence;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.sevumyan.arsen.app.api.EmployeeRepository;
import ru.sevumyan.arsen.domain.Employee;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EmployeeRepositoryAdapter implements EmployeeRepository {
    private final EmployeeJpaRepository employeeJpaRepository;

    @Override
    public List<Employee> findAll() {
        return employeeJpaRepository.findAll();
    }

    @Override
    public Employee save(Employee employee) {
        return employeeJpaRepository.save(employee);
    }

    @Override
    public List<Employee> findEmployeesWithoutMentors() {
        return employeeJpaRepository.findAllByMentorIsNull();
    }

    @Override
    public Employee getById(Long id) {
        return employeeJpaRepository.findById(id)
                .orElseThrow();
    }

    @Override
    public List<Employee> findByDepartmentId(Long id) {
        return employeeJpaRepository.findByDepartmentId(id);
    }
}
