package ru.sevumyan.arsen.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sevumyan.arsen.app.api.GetPositionsInbound;
import ru.sevumyan.arsen.app.api.PositionsRepository;
import ru.sevumyan.arsen.app.impl.GetPositionsUseCase;
import ru.sevumyan.arsen.domain.Position;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/positions")
public class PositionsController {
    private final GetPositionsUseCase getPositionsUseCase;

    @GetMapping
    public List<Position> getPositions() {
        return getPositionsUseCase.getAll();
    }
}
