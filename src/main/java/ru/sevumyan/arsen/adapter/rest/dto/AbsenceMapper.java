package ru.sevumyan.arsen.adapter.rest.dto;

import org.mapstruct.Mapper;
import ru.sevumyan.arsen.domain.Absence;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AbsenceMapper {
    AbsenceDto toAbsenceDto(Absence absence);

    List<AbsenceDto> toAbsenceDtoList(List<Absence> absences);
}
