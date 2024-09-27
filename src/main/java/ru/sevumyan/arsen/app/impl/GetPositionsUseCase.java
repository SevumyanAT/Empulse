package ru.sevumyan.arsen.app.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sevumyan.arsen.app.api.GetPositionsInbound;
import ru.sevumyan.arsen.app.api.PositionsRepository;
import ru.sevumyan.arsen.domain.Position;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetPositionsUseCase implements GetPositionsInbound {
    private final PositionsRepository positionsRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Position> getAll() {
        return positionsRepository.findAll();
    }
}
