package ru.sevumyan.arsen.adapter.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sevumyan.arsen.adapter.persistence.ConnectionManager;
import ru.sevumyan.arsen.adapter.persistence.DBManagement;
import ru.sevumyan.arsen.domain.Employee;
import ru.sevumyan.arsen.domain.Position;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api/home")
public class EmployeeController {
    private final ConnectionManager connectionManager = new ConnectionManager();
    private final DBManagement dbManagement = new DBManagement(connectionManager);

    @GetMapping("/employees")
    public List<Employee> getEmployee() throws SQLException {
        return dbManagement.execute();
    }

    @GetMapping("/positions")
    public List<Position> getPositions() throws SQLException {
        return dbManagement.displayPositions();
    }
}
