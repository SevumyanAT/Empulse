package ru.sevumyan.arsen.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sevumyan.arsen.app.impl.GetAbsencesUseCase;
import ru.sevumyan.arsen.domain.Absence;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/absences")
public class AbsenceController {
    private final GetAbsencesUseCase getAbsencesUseCase;

    @GetMapping
    public List<Absence> getAbsence() {
        return getAbsencesUseCase.getAll();
    }
}
