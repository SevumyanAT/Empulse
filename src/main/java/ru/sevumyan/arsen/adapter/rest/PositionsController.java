package ru.sevumyan.arsen.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.sevumyan.arsen.adapter.rest.dto.PositionDto;
import ru.sevumyan.arsen.adapter.rest.dto.PositionMapper;
import ru.sevumyan.arsen.app.impl.CreatePositionUseCase;
import ru.sevumyan.arsen.app.impl.GetPositionUseCase;
import ru.sevumyan.arsen.domain.Position;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/positions")
public class PositionsController {
    private final GetPositionUseCase getPositionUseCase;
    private final CreatePositionUseCase createPositionsUseCase;
    private final PositionMapper positionMapper;

    @GetMapping
    public List<PositionDto> getPositions() {
        List<Position> positions = getPositionUseCase.getAll();
        return positionMapper.toPositionDtoList(positions);
    }

    @PostMapping
    public PositionDto create(@RequestBody PositionDto positionDto) {
        Position newPosition = positionMapper.toPosition(positionDto);
        newPosition = createPositionsUseCase.create(newPosition);
        return positionMapper.toPositionDto(newPosition);
    }
}
