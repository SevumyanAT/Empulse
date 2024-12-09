package ru.sevumyan.arsen.app.api;

import ru.sevumyan.arsen.domain.Position;

public interface CreatePositionInbound {
    Position create(Position position);
}
