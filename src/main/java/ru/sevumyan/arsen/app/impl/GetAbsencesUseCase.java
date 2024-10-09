package ru.sevumyan.arsen.app.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sevumyan.arsen.app.api.AbsenceRepository;
import ru.sevumyan.arsen.app.api.GetAbsenceInbound;
import ru.sevumyan.arsen.domain.Absence;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAbsencesUseCase implements GetAbsenceInbound {
    private final AbsenceRepository absenceRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Absence> getAll() {
        return absenceRepository.findAll();
    }
}
