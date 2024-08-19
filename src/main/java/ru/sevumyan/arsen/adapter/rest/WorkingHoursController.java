package ru.sevumyan.arsen.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sevumyan.arsen.app.api.WorkingHoursRepository;
import ru.sevumyan.arsen.domain.WorkingHours;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/workinghours")
public class WorkingHoursController {
    private final WorkingHoursRepository workingHoursRepository;

    @GetMapping("/getworkinghours")
    public List<WorkingHours> getWorkingHours() throws SQLException {
        return workingHoursRepository.findAll();
    }
}
