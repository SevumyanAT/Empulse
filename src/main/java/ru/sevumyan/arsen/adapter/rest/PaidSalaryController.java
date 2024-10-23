package ru.sevumyan.arsen.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sevumyan.arsen.adapter.rest.dto.PaidSalaryDto;
import ru.sevumyan.arsen.adapter.rest.dto.PaidSalaryMapper;
import ru.sevumyan.arsen.app.impl.GetPaidSalariesUseCase;
import ru.sevumyan.arsen.domain.PaidSalary;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/paid-salaries")
public class PaidSalaryController {
    private final GetPaidSalariesUseCase getPaidSalariesUseCase;
    private final PaidSalaryMapper paidSalaryMapper;

    @GetMapping
    public List<PaidSalaryDto> getPaidSalary() {
        List<PaidSalary> paidSalaries = getPaidSalariesUseCase.getAll();
        return paidSalaryMapper.toPaidSalaryDtoList(paidSalaries);
    }
}
