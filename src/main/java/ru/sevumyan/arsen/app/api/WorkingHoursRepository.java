package ru.sevumyan.arsen.app.api;

import ru.sevumyan.arsen.domain.WorkingHour;

import java.util.List;

public interface WorkingHoursRepository {
    List<WorkingHour> findAll();
}
