package ru.sevumyan.arsen.app.api;

import ru.sevumyan.arsen.domain.Position;

import java.sql.SQLException;
import java.util.List;

public interface GetPositionsInbound {
    List<Position> displayPositions() throws SQLException;
}
