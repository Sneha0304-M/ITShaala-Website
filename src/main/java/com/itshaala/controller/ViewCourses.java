package com.itshaala.controller;

import com.itshaala.service.CourseService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/viewCourses")
public class ViewCourses extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        CourseService service = new CourseService();
        req.setAttribute("courseList", service.getCourses());

        req.getRequestDispatcher("/Course/viewCourses.jsp").forward(req, resp);
    }
}