package ru.sevumyan.arsen.adapter.persistence;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.sevumyan.arsen.app.api.WorkingHoursRepository;
import ru.sevumyan.arsen.domain.WorkingHours;

import java.util.List;

@Component
@RequiredArgsConstructor
public class WorkingHoursRepositoryAdapter implements WorkingHoursRepository {
    private final WorkingHoursJpaRepository workingHoursJpaRepository;

    @Override
    public List<WorkingHours> findAll() {
        return workingHoursJpaRepository.findAll();
    }
}
