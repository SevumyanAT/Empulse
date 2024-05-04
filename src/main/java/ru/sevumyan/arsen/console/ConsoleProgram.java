package ru.sevumyan.arsen.console;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.sevumyan.arsen.entity.Employee;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

@Component
@RequiredArgsConstructor
public class ConsoleProgram {
    private final EmployeeInput employeeInput;
    private final DBManagement dbManagement;

    public void consoleProgram() throws SQLException, IOException {
        try (Scanner sc = new Scanner(System.in)) {
            boolean stop = false;

            do {
                dbManagement.displayAvailableCommands();
                String value = sc.next();
                int command = -1;
                try {
                    command = Integer.parseInt(value);
                } catch (NumberFormatException e) {
                    System.out.println("Sorry, but this is clearly not a number. Restart the program and try again!");
                }

                switch (command) {
                    case 0 -> stop = true;
                    case 1 -> dbManagement.displayEmployees();
                    case 2 -> dbManagement.displayPost();
                    case 3 -> dbManagement.displayDepartment();
                    case 4 -> dbManagement.displayWorkingHours();
                    case 5 -> dbManagement.displayPaidSalary();
                    case 6 -> dbManagement.displayAbsence();
                    case 7 -> {
                        Employee employee = employeeInput.employeeRead(sc);
                        dbManagement.employeeInput(employee);
                    }
                }
            } while (!stop);
        }
    }
}
