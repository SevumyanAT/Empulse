package ru.sevumyan.arsen.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.sevumyan.arsen.adapter.rest.dto.DepartmentDto;
import ru.sevumyan.arsen.app.impl.GetDepartmentsUseCase;
import ru.sevumyan.arsen.domain.Department;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/departments")
public class DepartmentController {
    private final GetDepartmentsUseCase getDepartmentsUseCase;

    @GetMapping
    public List<DepartmentDto> getDepartments() {
        return getDepartmentsUseCase.getAll().stream()
                .map(this::createDepartmentDto)
                .toList();
    }

    private DepartmentDto createDepartmentDto(Department department) {
        DepartmentDto departmentDto = new DepartmentDto();
        departmentDto.setId(department.getId());
        departmentDto.setDepartmentLocation(department.getDepartmentLocation());
        return departmentDto;
    }
}
