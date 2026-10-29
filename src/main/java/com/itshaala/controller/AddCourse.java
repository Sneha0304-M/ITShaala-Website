package com.itshaala.controller;

import com.itshaala.model.Course;
import com.itshaala.service.CourseService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/addCourse")
public class AddCourse extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        Course c = new Course();
        c.setCourseName(req.getParameter("name"));
        c.setCourseDuration(req.getParameter("duration"));
        c.setCourseFee(Double.parseDouble(req.getParameter("fee")));

        CourseService service = new CourseService();
        service.addCourse(c);

        resp.sendRedirect("../dashboard");
    }
}