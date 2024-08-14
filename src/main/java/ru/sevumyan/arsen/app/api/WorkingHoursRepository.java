package ru.sevumyan.arsen.app.api;

import ru.sevumyan.arsen.domain.WorkingHours;

import java.util.List;

public interface WorkingHoursRepository {
    List<WorkingHours> findAll();
}
