package ru.sevumyan.arsen.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sevumyan.arsen.adapter.rest.dto.PositionDto;
import ru.sevumyan.arsen.adapter.rest.dto.PositionMapper;
import ru.sevumyan.arsen.app.impl.GetPositionsUseCase;
import ru.sevumyan.arsen.domain.Position;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/positions")
public class PositionsController {
    private final GetPositionsUseCase getPositionsUseCase;
    private final PositionMapper positionMapper;

    @GetMapping
    public List<PositionDto> getPositions() {
        List<Position> positions = getPositionsUseCase.getAll();
        return positionMapper.toPositionDtoList(positions);
    }
}
