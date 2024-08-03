package ru.sevumyan.arsen.adapter.persistence;

import org.springframework.stereotype.Component;

import java.sql.*;

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
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
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
                throw new RuntimeException(e);
            }
        } else if (statement == null) {
            try {
                statement = connection.createStatement();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            return statement;
        }
        return statement;
    }
}