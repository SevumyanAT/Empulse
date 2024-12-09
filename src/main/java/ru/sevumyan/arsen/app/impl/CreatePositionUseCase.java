package ru.sevumyan.arsen.app.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sevumyan.arsen.app.api.CreatePositionInbound;
import ru.sevumyan.arsen.app.api.PositionsRepository;
import ru.sevumyan.arsen.domain.Position;

@Service
@RequiredArgsConstructor
public class CreatePositionUseCase implements CreatePositionInbound {
    private final PositionsRepository positionsRepository;

    @Override
    public Position create(Position position) {
        return positionsRepository.save(position);
    }
}
