package ru.sevumyan.arsen.console;

import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class ConsoleProgram {
    static final String URL = "jdbc:postgresql://localhost/postgres";
    static final String Employee = "Select * from employee";
    static final String Department = "Select * from department";
    static final String Working_Hours = "select * from paid_salary";
    static final String Absence = "Select * from absence";
    static final String Post = "Select * from post";
    static final String Paid_Salary = "Select * from paid_salary";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) throws SQLException {
        try (Scanner sc = new Scanner(System.in)) {
            boolean stop = false;

            do {
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

                String value = sc.next();
                int command = -1;


                try {
                    command = Integer.parseInt(value);
                } catch (NumberFormatException e) {
                    System.out.println("Sorry, but this is clearly not a number. Restart the program and try again!");
                }

                switch (command) {
                    case 0 -> stop = true;
                    case 1 -> displayEmployees();
                    case 2 -> displayPost();
                    case 3 -> displayDepartment();
                    case 4 -> displayWorkingHours();
                    case 5 -> displayPaidSalary();
                    case 6 -> displayAbsence();
                }

            } while (!stop);
        }
    }

    public static void displayEmployees() throws SQLException {
        Properties props = connection();
        try (Connection conn = DriverManager.getConnection(URL, props);) {
            try (Statement stmt = conn.createStatement();) {
                try (ResultSet rs = stmt.executeQuery(Employee);) {
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
        }
    }

    public static void displayPost() throws SQLException {
        Properties props = connection();
        try (Connection conn = DriverManager.getConnection(URL, props);) {
            try (Statement stmt = conn.createStatement();) {
                try (ResultSet rs = stmt.executeQuery(Post);) {
                    while (rs.next()) {

                        System.out.print("Post name: " + rs.getString("post_name") + "\t");
                        System.out.print(ANSI_BLUE + " Wage: " + rs.getInt("wage") + "\t\n" + ANSI_RESET);
                    }
                }
            }
        }
    }

    public static void displayDepartment() throws SQLException {
        Properties props = connection();

        try (Connection conn = DriverManager.getConnection(URL, props);) {

            try (Statement stmt = conn.createStatement();) {
                try (ResultSet rs = stmt.executeQuery(Department);) {

                    while (rs.next()) {
                        System.out.print("Department Location: " + rs.getString("department_location") + "\t\n");

                    }
                }
            }
        }
    }

    public static void displayWorkingHours() throws SQLException {
        Properties props = connection();

        try (Connection conn = DriverManager.getConnection(URL, props);) {

            try (Statement stmt = conn.createStatement();) {
                try (ResultSet rs = stmt.executeQuery(Working_Hours);) {

                    while (rs.next()) {
                        System.out.print("Employee ID: " + rs.getString("employee_id") + "\t");
                        System.out.println(ANSI_BLUE + "Working hours: " + rs.getInt("working_hours") + "\t\n" + ANSI_RESET);

                    }
                }
            }
        }
    }

    public static void displayPaidSalary() throws SQLException {
        Properties props = connection();
        try (Connection conn = DriverManager.getConnection(URL, props);) {

            try (Statement stmt = conn.createStatement();) {
                try (ResultSet rs = stmt.executeQuery(Paid_Salary);) {

                    while (rs.next()) {
                        System.out.print("Employee ID: " + rs.getString("employee_id") + "\t");
                        System.out.println(ANSI_BLUE + "Payment date: " + rs.getDate("payment_date") + "\t\n" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "Bank account: " + rs.getInt("bank_account") + "\t\n" + ANSI_RESET);
                    }
                }
            }
        }
    }

    public static void displayAbsence() throws SQLException {
        Properties props = connection();
        try (Connection conn = DriverManager.getConnection(URL, props);) {
            try (Statement stmt = conn.createStatement();) {
                try (ResultSet rs = stmt.executeQuery(Absence);) {
                    while (rs.next()) {
                        System.out.print("Employee ID: " + rs.getString("employee_id") + "\t");
                        System.out.println(ANSI_BLUE + "Absence date: " + rs.getDate("absence_date") + "\t\n" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "Bank account: " + rs.getInt("bank_account") + "\t\n" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "Cause: " + rs.getString("cause") + "\t\n" + ANSI_RESET);
                    }
                }
            }
        }
    }

    public static Properties connection() throws SQLException {
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "postgres");

        return props;
    }
}

