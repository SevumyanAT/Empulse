package ru.sevumyan.arsen.adapter.rest.dto;

import org.mapstruct.Mapper;
import ru.sevumyan.arsen.domain.PaidSalary;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PaidSalaryMapper {

    PaidSalaryDto toPaidSalaryDto(PaidSalary paidSalary);

    List<PaidSalaryDto> toPaidSalaryDtoList(List<PaidSalary> paidSalary);
}
