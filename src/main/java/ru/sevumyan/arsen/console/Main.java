package ru.sevumyan.arsen.console;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext("ru.sevumyan.arsen.console");
        context.getBean(ConsoleProgram.class).consoleProgram();

    }
}

