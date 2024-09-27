package ru.sevumyan.arsen.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.sevumyan.arsen.app.impl.GetDepartmentsUseCase;
import ru.sevumyan.arsen.domain.Department;
import ru.sevumyan.arsen.domain.Employee;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/departments")
public class DepartmentController {
    private final GetDepartmentsUseCase getDepartmentsUseCase;

    @GetMapping
    public List<Department> getDepartment() {
        return getDepartmentsUseCase.getAll();
    }

  //  @GetMapping(value = "/staff/{id}")
  //  public Optional<Department> getEmployeesByDepartment(@PathVariable Long id){
  //     return getDepartmentsUseCase.getAllEmployeesFromDepartment(id);
  //  }
}
