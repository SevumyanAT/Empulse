package ru.sevumyan.arsen.managments;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ru.sevumyan.arsen.entity.Employee;
import ru.sevumyan.arsen.entity.Position;

import java.sql.*;
import java.util.ArrayList;

@Component
@RequiredArgsConstructor
public class DBManagement {
    private static final Logger LOGGER = LoggerFactory.getLogger(DBManagement.class.getName());
    private static final String EMPLOYEE = "Select * from employee";
    private static final String COUNT = "select count (*) from employee;";
    private static final String DEPARTMENT = "Select * from department";
    private static final String WORKING_HOURS = "select * from working_hours";
    private static final String ABSENCE = "Select * from absence";
    private static final String POST = "Select * from post";
    private static final String PAID_SALARY = "Select * from paid_salary";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";

    private final ConnectionManager connectionManager;
    private final ObjectMapper objectMapper = new ObjectMapper();

    public String displayEmployees() throws SQLException, JsonProcessingException {
        ArrayList<Employee> employees = new ArrayList<>();
        String value = "";
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        try (ResultSet rs = getStatement().executeQuery(EMPLOYEE)) {
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setFirstName(rs.getString("first_name"));
                employee.setLastName(rs.getString("last_name"));
                employee.setPassportNumber(rs.getInt("passport_no"));
                employee.setUniversityEducation(rs.getString("university_education"));
                employee.setBirthDate(String.valueOf(rs.getDate("birth_date")));
                employee.setBankAccount(rs.getInt("bank_account"));
                employee.setPostId(rs.getInt("post_id"));
                employee.setDepartmentId(rs.getInt("department_id"));
                employees.add(employee);
            }
            value = objectMapper.writeValueAsString(employees);
        }
        return value;
    }

    public String displayPosition() throws SQLException, JsonProcessingException {
        ArrayList<Position> positions = new ArrayList<>();
        String value = "";
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        try (ResultSet rs = getStatement().executeQuery(POST)) {
            while (rs.next()) {
                Position position = new Position();
                position.setPost_Name(rs.getString("post_name"));
                position.setWage(rs.getInt("wage"));
                positions.add(position);
            }
            value = objectMapper.writeValueAsString(positions);
        }
        return value;
    }

    public void displayDepartment() throws SQLException {
        ArrayList<String> departments = new ArrayList<>();
        try (ResultSet rs = getStatement().executeQuery(DEPARTMENT)) {
            while (rs.next()) {
                System.out.print("Department Location: " + rs.getString("department_location") + "\t\n");
            }
        }
    }

    public void displayWorkingHours() throws SQLException {
        try (ResultSet rs = getStatement().executeQuery(WORKING_HOURS)) {
            while (rs.next()) {
                System.out.print("Employee ID: " + rs.getString("employee_id") + "\t");
                System.out.println(ANSI_BLUE + "Working hours: " + rs.getInt("working_hours") + "\t\n" + ANSI_RESET);
            }
        }
    }

    public void displayPaidSalary() throws SQLException {
        try (ResultSet rs = getStatement().executeQuery(PAID_SALARY)) {
            while (rs.next()) {
                System.out.print("Employee ID: " + rs.getString("employee_id") + "\t");
                System.out.println(ANSI_BLUE + "Payment date: " + rs.getDate("payment_date") + "\t\n" + ANSI_RESET);
                System.out.println(ANSI_BLUE + "Bank account: " + rs.getInt("bank_account") + "\t\n" + ANSI_RESET);
            }
        }
    }

    public void displayAbsence() throws SQLException {
        try (ResultSet rs = getStatement().executeQuery(ABSENCE)) {
            while (rs.next()) {
                System.out.print("Employee ID: " + rs.getString("employee_id") + "\t");
                System.out.println(ANSI_BLUE + "Absence date: " + rs.getDate("absence_date") + "\t\n" + ANSI_RESET);
                System.out.println(ANSI_BLUE + "Bank account: " + rs.getInt("bank_account") + "\t\n" + ANSI_RESET);
                System.out.println(ANSI_BLUE + "Cause: " + rs.getString("cause") + "\t\n" + ANSI_RESET);
            }
        }
    }

    public void displayAvailableCommands() {
        System.out.println("The console program started working!\n" +
                "Available commands:\n" +
                ANSI_BLUE + "0" + ANSI_RESET + "- shutting down the application\n" +
                ANSI_BLUE + "1" + ANSI_RESET + "- output the values of the employees table\n" +
                ANSI_BLUE + "2" + ANSI_RESET + "- output the values of the post table\n" +
                ANSI_BLUE + "3" + ANSI_RESET + "- output the values of the department table\n" +
                ANSI_BLUE + "4" + ANSI_RESET + "- output the values of the working hours table\n" +
                ANSI_BLUE + "5" + ANSI_RESET + "- output the values of the paid salary table\n" +
                ANSI_BLUE + "6" + ANSI_RESET + "- output the values of the absence table\n" +
                ANSI_BLUE + "7" + ANSI_RESET + "-add employee values to table\n");
        System.out.print("Enter the command: ");
    }

    public void employeeInput(Employee employee) throws SQLException {
        String sql = "insert into employee " +
                "(first_name, last_name, passport_no, university_education, " +
                "birth_date, bank_account, post_id, department_id)" +
                "values ( ?,?,?,?,?,?,?,?)";

        try (PreparedStatement preparedStatement = getConnection().prepareStatement(sql)) {
            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setInt(3, employee.getPassportNumber());
            preparedStatement.setString(4, employee.getUniversityEducation());
            preparedStatement.setDate(5, Date.valueOf(employee.getBirthDate()));
            preparedStatement.setInt(6, employee.getBankAccount());
            preparedStatement.setInt(7, employee.getPostId());
            preparedStatement.setInt(8, employee.getDepartmentId());
            preparedStatement.executeUpdate();
        }
    }

    private Statement getStatement() {
        return connectionManager.getStatement();
    }

    private Connection getConnection() {
        return connectionManager.getConnection();
    }
}
