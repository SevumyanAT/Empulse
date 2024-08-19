package ru.sevumyan.arsen.adapter.persistence;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.sevumyan.arsen.app.api.PositionsRepository;
import ru.sevumyan.arsen.domain.Position;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PositionsRepositoryAdapter implements PositionsRepository {
    private final PositionsJpaRepository positionsJpaRepository;

    @Override
    public List<Position> findAll() {
        return positionsJpaRepository.findAll();
    }

}
