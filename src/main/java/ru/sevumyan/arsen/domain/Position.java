package ru.sevumyan.arsen.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Entity
@Accessors(chain = true)
@NoArgsConstructor
@Table(name = "positions")
public class Position {
    @Id
    @Column(name="id")
    private long id;
    @Column(name="post_name")
    private String post_Name;
    @Column(name="wage")
    private int wage;
}
