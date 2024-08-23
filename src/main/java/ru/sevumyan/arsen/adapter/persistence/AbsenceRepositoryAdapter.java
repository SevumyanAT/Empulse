package ru.sevumyan.arsen.adapter.persistence;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.sevumyan.arsen.app.api.AbsenceRepository;
import ru.sevumyan.arsen.domain.Absence;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AbsenceRepositoryAdapter implements AbsenceRepository {
    private final AbsenceJpaRepository absenceJpaRepository;

    @Override
    public List<Absence> findAll() {
        return absenceJpaRepository.findAll();
    }
}
