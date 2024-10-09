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
@RequiredArgsConstructor
public class GetEmployeesUseCase implements GetEmployeesInbound {
    private final EmployeeRepository employeeRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Employee> getAllWithoutMentors() {
        return employeeRepository.findEmployeesWithoutMentors();
    }

    @Override
    @Transactional(readOnly = true)
    public Employee getById(Long id) {
        return employeeRepository.getById(id);
}

    @Override
    @Transactional(readOnly = true)
    public List<Employee> getEmployeesFromDepartment(Long id) {
        return employeeRepository.findEmployeesFromDepartment(id);
    }
}
