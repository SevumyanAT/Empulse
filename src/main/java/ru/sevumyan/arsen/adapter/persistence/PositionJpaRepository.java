package ru.sevumyan.arsen.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sevumyan.arsen.domain.Position;

public interface PositionJpaRepository extends JpaRepository<Position, Long> {
}
