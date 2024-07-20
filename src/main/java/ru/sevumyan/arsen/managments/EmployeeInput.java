package ru.sevumyan.arsen.managments;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import ru.sevumyan.arsen.entity.Employee;

import java.util.Scanner;

@NoArgsConstructor
@Component
public class EmployeeInput {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public Employee employeeRead(Scanner scanner) throws JsonProcessingException {

        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        System.out.println("Enter the employee's data in JSON format");
        scanner.nextLine();
        String EmployeeJson = scanner.nextLine();
        Employee employee = objectMapper.readValue(EmployeeJson, Employee.class);

        return employee;
    }
}
