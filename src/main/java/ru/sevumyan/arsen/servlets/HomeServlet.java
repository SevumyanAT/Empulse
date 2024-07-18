package ru.sevumyan.arsen.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("/employees - список сотрудников." +
                "/positions - список должностей./n" + "/n" +
                "/departments - список департаментов." +
                "/workinghours - данные по времени работы сотрудников." +
                "/paidsalaries - список выплаченных зарплат." +
                "/absences - список отпусков и больничных.");
        printWriter.close();
    }
}
