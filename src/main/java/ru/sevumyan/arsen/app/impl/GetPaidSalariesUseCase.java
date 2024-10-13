package ru.sevumyan.arsen.app.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sevumyan.arsen.app.api.GetPaidSalariesInbound;
import ru.sevumyan.arsen.app.api.PaidSalaryRepository;
import ru.sevumyan.arsen.domain.PaidSalary;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetPaidSalariesUseCase implements GetPaidSalariesInbound {
    private final PaidSalaryRepository paidSalaryRepository;

    @Override
    @Transactional(readOnly = true)
    public List<PaidSalary> getAll() {
        return paidSalaryRepository.findAll();
    }
}
