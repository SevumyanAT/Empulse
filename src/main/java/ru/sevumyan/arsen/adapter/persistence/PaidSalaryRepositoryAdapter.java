package ru.sevumyan.arsen.adapter.persistence;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.sevumyan.arsen.app.api.PaidSalaryRepository;
import ru.sevumyan.arsen.domain.PaidSalary;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PaidSalaryRepositoryAdapter implements PaidSalaryRepository {
    private final PaidSalaryJpaRepository paidSalaryJpaRepository;
    @Override
    public List<PaidSalary> findAll(){
        return paidSalaryJpaRepository.findAll();
    }
}
