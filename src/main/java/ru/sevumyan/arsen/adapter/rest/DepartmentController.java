package ru.sevumyan.arsen.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.sevumyan.arsen.adapter.rest.dto.DepartmentDto;
import ru.sevumyan.arsen.adapter.rest.dto.DepartmentMapper;
import ru.sevumyan.arsen.app.impl.CreateDepartmentUseCase;
import ru.sevumyan.arsen.app.impl.GetDepartmentsUseCase;
import ru.sevumyan.arsen.domain.Department;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/departments")
public class DepartmentController {
    private final GetDepartmentsUseCase getDepartmentsUseCase;
    private final CreateDepartmentUseCase createDepartmentUseCase;
    private final DepartmentMapper departmentMapper;

    @GetMapping
    public List<DepartmentDto> getDepartments() {
        List<Department> departments = getDepartmentsUseCase.getAll();
        return departmentMapper.toDepartmentDtoList(departments);
    }

    @PostMapping
    public DepartmentDto create(@RequestBody DepartmentDto departmentDto) {
        Department newDepartment = departmentMapper.toDepartment(departmentDto);
        newDepartment = createDepartmentUseCase.create(newDepartment);
        return departmentMapper.toDepartmentDto(newDepartment);
    }
}
