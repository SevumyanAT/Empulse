package ru.sevumyan.arsen.app.api;

import ru.sevumyan.arsen.domain.WorkingHour;

import java.util.List;

public interface GetWorkingHoursInbound {
    List<WorkingHour> getAll();
}
