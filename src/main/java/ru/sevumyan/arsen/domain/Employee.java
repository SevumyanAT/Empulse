package ru.sevumyan.arsen.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.time.LocalDate;


@Getter
@Setter
@Entity
@Accessors(chain = true)
@NoArgsConstructor
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "passport_no")
    private String passportNumber;
    @Column(name = "university_education")
    private String universityEducation;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "bank_account")
    private String bankAccount;
    @Column(name = "post_id")
    private int postId;
    @Column(name = "department_id")
    private int departmentId;
}
