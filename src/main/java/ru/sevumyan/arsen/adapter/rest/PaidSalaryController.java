package ru.sevumyan.arsen.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sevumyan.arsen.app.api.PaidSalaryRepository;
import ru.sevumyan.arsen.domain.PaidSalary;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PaidSalaryController {
    private final PaidSalaryRepository paidSalaryRepository;

    @GetMapping("/paid-salaries")
    public List<PaidSalary> getPaidSalary() throws SQLException {
        return paidSalaryRepository.findAll();
    }
}
