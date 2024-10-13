package ru.sevumyan.arsen.app.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sevumyan.arsen.app.api.EmployeeRepository;
import ru.sevumyan.arsen.app.api.GetEmployeesInbound;
import ru.sevumyan.arsen.domain.Employee;

import java.util.List;

@Service
@Slf4j
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class GetEmployeesUseCase implements GetEmployeesInbound {
    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllWithoutMentors() {
        return employeeRepository.findEmployeesWithoutMentors();
    }

    @Override
    public Employee getById(Long id) {
        return employeeRepository.getById(id);
    }

    @Override
    public List<Employee> getAllByFilters(Long departmentId) {
        if (departmentId == null) {
            return employeeRepository.findAll();
        } else {
            return employeeRepository.findByDepartmentId(departmentId);
        }
    }
}
