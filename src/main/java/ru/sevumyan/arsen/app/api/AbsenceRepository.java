package ru.sevumyan.arsen.app.api;

import ru.sevumyan.arsen.domain.Absence;

import java.util.List;

public interface AbsenceRepository {
    List<Absence> findAll();
}
