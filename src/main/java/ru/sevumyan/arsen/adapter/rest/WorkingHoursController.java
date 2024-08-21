package ru.sevumyan.arsen.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sevumyan.arsen.app.api.WorkingHoursRepository;
import ru.sevumyan.arsen.domain.WorkingHours;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/working-hours")
public class WorkingHoursController {
    private final WorkingHoursRepository workingHoursRepository;

    @GetMapping
    public List<WorkingHours> getWorkingHours() {
        return workingHoursRepository.findAll();
    }
}
