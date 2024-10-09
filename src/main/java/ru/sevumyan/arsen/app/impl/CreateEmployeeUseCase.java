package ru.sevumyan.arsen.app.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sevumyan.arsen.app.api.CreateEmployeeInbound;
import ru.sevumyan.arsen.app.api.EmployeeRepository;
import ru.sevumyan.arsen.domain.Employee;

@Service
@RequiredArgsConstructor
public class CreateEmployeeUseCase implements CreateEmployeeInbound {
   private final EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }
}
