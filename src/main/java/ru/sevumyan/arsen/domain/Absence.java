package ru.sevumyan.arsen.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Accessors(chain = true)
@RequiredArgsConstructor
@Table(name = "absence")
public class Absence {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "employee_id", insertable = false, updatable = false)
    private Employee employee;
    @Column(name = "absence_date")
    private LocalDate absenceDate;
    @Column(name = "bank_account")
    private String bankAccount;
    @Column(name = "cause")
    private String cause;
}
