package ru.sevumyan.arsen.adapter.rest.dto;

import org.mapstruct.Mapper;
import ru.sevumyan.arsen.domain.WorkingHour;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WorkingHourMapper {
    WorkingHourDto toWorkingHourDto(WorkingHour workingHour);

    List<WorkingHourDto> toWorkingHourDtoList(List<WorkingHour> workingHours);
}
