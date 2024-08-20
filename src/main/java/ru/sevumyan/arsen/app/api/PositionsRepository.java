package ru.sevumyan.arsen.app.api;

import ru.sevumyan.arsen.domain.Position;

import java.util.List;

public interface PositionsRepository {
    List<Position> findAll();
}
