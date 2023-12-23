package ru.sevumyan.arsen.console;

import java.sql.*;

public class DBManagement {
    private static final String URL = "jdbc:postgresql://localhost/postgres";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "postgres";
    private static final String Employee = "Select * from employee";
    private static final String Department = "Select * from department";
    private static final String Working_Hours = "select * from working_hours";
    private static final String Absence = "Select * from absence";
    private static final String Post = "Select * from post";
    private static final String Paid_Salary = "Select * from paid_salary";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";

   private Connection conn;

    {
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void displayEmployees() throws SQLException {
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(Employee)) {
            while (rs.next()) {
                System.out.print("First Name: " + rs.getString("first_name") + "\t");
                System.out.print(ANSI_BLUE + " Last Name: " + rs.getString("last_name") + "\t");
                System.out.print(ANSI_RESET + " Passport number: " + rs.getInt("passport_no") + "\t");
                System.out.print(ANSI_BLUE + " University education: " + rs.getString("university_education") + "\t");
                System.out.print(ANSI_RESET + " Birth date: " + rs.getDate("birth_date") + "\t");
                System.out.print(ANSI_BLUE + " Bank account: " + rs.getInt("bank_account") + "\t");
                System.out.print(ANSI_RESET + " Post ID: " + rs.getInt("post_id") + "\t");
                System.out.print(ANSI_BLUE + " Department ID: " + rs.getInt("department_id") + "\t\n" + ANSI_RESET);
            }
        }
    }

    public void displayPost() throws SQLException {
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(Post)) {
            while (rs.next()) {

                System.out.print("Post name: " + rs.getString("post_name") + "\t");
                System.out.print(ANSI_BLUE + " Wage: " + rs.getInt("wage") + "\t\n" + ANSI_RESET);
            }
        }
    }

    public  void displayDepartment() throws SQLException {

        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(Department)) {

            while (rs.next()) {
                System.out.print("Department Location: " + rs.getString("department_location") + "\t\n");
            }
        }
    }

    public void displayWorkingHours() throws SQLException {

        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(Working_Hours)) {

            while (rs.next()) {
                System.out.print("Employee ID: " + rs.getString("employee_id") + "\t");
                System.out.println(ANSI_BLUE + "Working hours: " + rs.getInt("working_hours") + "\t\n" + ANSI_RESET);
            }
        }
    }

    public void displayPaidSalary() throws SQLException {
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(Paid_Salary)) {
            while (rs.next()) {
                System.out.print("Employee ID: " + rs.getString("employee_id") + "\t");
                System.out.println(ANSI_BLUE + "Payment date: " + rs.getDate("payment_date") + "\t\n" + ANSI_RESET);
                System.out.println(ANSI_BLUE + "Bank account: " + rs.getInt("bank_account") + "\t\n" + ANSI_RESET);
            }
        }
    }

    public void displayAbsence() throws SQLException {

        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(Absence)) {
            while (rs.next()) {
                System.out.print("Employee ID: " + rs.getString("employee_id") + "\t");
                System.out.println(ANSI_BLUE + "Absence date: " + rs.getDate("absence_date") + "\t\n" + ANSI_RESET);
                System.out.println(ANSI_BLUE + "Bank account: " + rs.getInt("bank_account") + "\t\n" + ANSI_RESET);
                System.out.println(ANSI_BLUE + "Cause: " + rs.getString("cause") + "\t\n" + ANSI_RESET);
            }
        }
    }

    public void displayAvailableCommands(){
        System.out.println("The console program started working!\n" +
                "Available commands:\n" +
                ANSI_BLUE + "0" + ANSI_RESET + "- shutting down the application\n" +
                ANSI_BLUE + "1" + ANSI_RESET + "- output the values of the employees table\n" +
                ANSI_BLUE + "2" + ANSI_RESET + "- output the values of the post table\n" +
                ANSI_BLUE + "3" + ANSI_RESET + "- output the values of the department table\n" +
                ANSI_BLUE + "4" + ANSI_RESET + "- output the values of the working hours table\n" +
                ANSI_BLUE + "5" + ANSI_RESET + "- output the values of the paid salary table\n" +
                ANSI_BLUE + "6" + ANSI_RESET + "- output the values of the absence table\n");
        System.out.print("Enter the command: ");
    }
}
