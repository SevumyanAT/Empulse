package ru.sevumyan.arsen.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sevumyan.arsen.domain.WorkingHour;

public interface WorkingHoursJpaRepository extends JpaRepository<WorkingHour, Long> {
}
