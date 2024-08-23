package ru.sevumyan.arsen.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sevumyan.arsen.domain.Absence;

public interface AbsenceJpaRepository extends JpaRepository<Absence, Long> {
}
