package ru.sevumyan.arsen.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Entity
@Accessors(chain = true)
@NoArgsConstructor
@Table(name = "department")
public class Department {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "department_location")
    private String departmentLocation;
    @OneToMany
    @JoinColumn(name = "department_id")
    private List<Employee> employees;
}
