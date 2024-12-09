package ru.sevumyan.arsen.adapter.persistence;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.sevumyan.arsen.app.api.PositionsRepository;
import ru.sevumyan.arsen.domain.Position;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PositionRepositoryAdapter implements PositionsRepository {
    private final PositionJpaRepository positionJpaRepository;

    @Override
    public List<Position> findAll() {
        return positionJpaRepository.findAll();
    }

    @Override
    public Position save(Position position) {
        return positionJpaRepository.save(position);
    }
}
