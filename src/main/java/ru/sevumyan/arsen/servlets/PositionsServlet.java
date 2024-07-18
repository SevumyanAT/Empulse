package ru.sevumyan.arsen.servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import ru.sevumyan.arsen.managments.DBManagement;

import java.io.IOException;
import java.io.PrintWriter;

public class PositionsServlet extends HttpServlet {
    private static final Logger LOGGER = LoggerFactory.getLogger(PositionsServlet.class.getName());

    private DBManagement dbManagement;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
        dbManagement = context.getBean(DBManagement.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        PrintWriter printWriter = resp.getWriter();
        try {
            printWriter.write(dbManagement.displayPosition());
        } catch (Exception e) {
            LOGGER.error("Error" + e, e);
        }
        printWriter.close();
    }


}
