package ru.sevumyan.arsen.console;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@Component
public class ConnectionManager {
    private static final String URL = "jdbc:postgresql://localhost/postgres";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "postgres";

    private Connection connection;
    private Statement statement;

    public Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (SQLException e) {
                throw new RuntimeException();
            }
        } else {
            return connection;
        }
        return connection;
    }

    public Statement getStatement() {
        if (connection == null) {
            getConnection();
            try {
                statement = connection.createStatement();
            } catch (SQLException e) {
                throw new RuntimeException();
            }
        } else if (statement == null) {
            try {
                statement = connection.createStatement();
            } catch (SQLException e) {
                throw new RuntimeException();
            }
        } else {
            return statement;
        }
        return statement;
    }
}