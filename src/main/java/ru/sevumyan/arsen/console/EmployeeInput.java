package ru.sevumyan.arsen.console;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.sevumyan.arsen.entity.Employee;

import java.util.Objects;
import java.util.Scanner;

public class EmployeeInput {

    public EmployeeInput() {

    }

    public Employee employeeRead(Scanner scanner) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        String jsonemployee = null;
        Employee employee;
        boolean stop = false;

        System.out.println("Enter the employee's data in JSON format");
        scanner.nextLine();
        jsonemployee = scanner.nextLine();

        employee = objectMapper.readValue(jsonemployee, Employee.class);

        return employee;
    }

}
