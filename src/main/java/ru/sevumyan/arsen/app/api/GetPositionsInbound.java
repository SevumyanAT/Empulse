package ru.sevumyan.arsen.app.api;

import ru.sevumyan.arsen.domain.Position;

import java.util.List;

public interface GetPositionsInbound {
    List<Position> getAll();
}
