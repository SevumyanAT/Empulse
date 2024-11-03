package ru.sevumyan.arsen.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sevumyan.arsen.adapter.rest.dto.AbsenceDto;
import ru.sevumyan.arsen.adapter.rest.dto.AbsenceMapper;
import ru.sevumyan.arsen.app.impl.GetAbsencesUseCase;
import ru.sevumyan.arsen.domain.Absence;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/absences")
public class AbsenceController {
    private final GetAbsencesUseCase getAbsencesUseCase;
    private final AbsenceMapper absenceMapper;

    @GetMapping
    public List<AbsenceDto> getAbsence() {
        List<Absence> absences = getAbsencesUseCase.getAll();
        return absenceMapper.toAbsenceDtoList(absences);
    }
}
