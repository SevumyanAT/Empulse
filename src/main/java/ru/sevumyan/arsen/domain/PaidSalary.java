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
@Table(name="paid_salary")
public class PaidSalary {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "employee_id", insertable = false, updatable = false)
    private Employee employee;
    @Column(name="payment_date")
    private LocalDate paymentDate;
    @Column(name="bank_account")
    private String bankAccount;
}
