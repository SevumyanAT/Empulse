package ru.sevumyan.arsen.adapter.rest.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class PositionDto {
    private Long id;

    private String postName;

    private int wage;
}
