package ru.sevumyan.arsen.app.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sevumyan.arsen.app.api.GetWorkingHoursInbound;
import ru.sevumyan.arsen.app.api.WorkingHoursRepository;
import ru.sevumyan.arsen.domain.WorkingHour;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetWorkingHoursUseCase implements GetWorkingHoursInbound {
    private final WorkingHoursRepository workingHoursRepository;

    @Override
    @Transactional(readOnly = true)
    public List<WorkingHour> getAll() {
        return workingHoursRepository.findAll();
    }
}
