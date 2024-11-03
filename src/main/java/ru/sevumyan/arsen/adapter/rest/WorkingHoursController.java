package ru.sevumyan.arsen.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sevumyan.arsen.adapter.rest.dto.WorkingHourDto;
import ru.sevumyan.arsen.adapter.rest.dto.WorkingHourMapper;
import ru.sevumyan.arsen.app.impl.GetWorkingHoursUseCase;
import ru.sevumyan.arsen.domain.WorkingHour;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/working-hours")
public class WorkingHoursController {
    private final GetWorkingHoursUseCase getWorkingHoursUseCase;
    private final WorkingHourMapper workingHourMapper;

    @GetMapping
    public List<WorkingHourDto > getWorkingHours() {
        List<WorkingHour> workingHours = getWorkingHoursUseCase.getAll();
        return workingHourMapper.toWorkingHourDtoList(workingHours);
    }
}
