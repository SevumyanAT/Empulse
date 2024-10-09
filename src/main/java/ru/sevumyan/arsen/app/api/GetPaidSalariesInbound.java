package ru.sevumyan.arsen.app.api;

import ru.sevumyan.arsen.domain.PaidSalary;

import java.util.List;

public interface GetPaidSalariesInbound {
    List<PaidSalary> getAll();
}
