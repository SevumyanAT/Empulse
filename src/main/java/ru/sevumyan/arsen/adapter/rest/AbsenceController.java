package ru.sevumyan.arsen.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sevumyan.arsen.app.api.AbsenceRepository;
import ru.sevumyan.arsen.domain.Absence;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/absence")
public class AbsenceController {
    private final AbsenceRepository absenceRepository;

    @GetMapping("/getabsence")
    public List<Absence> getAbsence() throws SQLException {
        return absenceRepository.findAll();
    }

}
