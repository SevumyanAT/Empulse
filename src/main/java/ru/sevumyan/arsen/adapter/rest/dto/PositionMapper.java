package ru.sevumyan.arsen.adapter.rest.dto;

import org.mapstruct.Mapper;
import ru.sevumyan.arsen.domain.Position;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PositionMapper {
    PositionDto toPositionDto(Position position);

    List<PositionDto> toPositionDtoList(List<Position> positions);

    Position toPosition(PositionDto positionDto);
}
