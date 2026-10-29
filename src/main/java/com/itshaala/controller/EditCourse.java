package com.itshaala.controller;

import com.itshaala.model.Course;
import com.itshaala.service.CourseService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/editCourse")
public class EditCourse extends HttpServlet {

    // form load
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));

        CourseService service = new CourseService();
        req.setAttribute("course", service.getCourseById(id)); // ⭐ used

        req.getRequestDispatcher("/Course/editCourse.jsp").forward(req, resp);
    }

    // update submit
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        Course c = new Course();
        c.setCourseId(Integer.parseInt(req.getParameter("id")));
        c.setCourseName(req.getParameter("name"));
        c.setCourseDuration(req.getParameter("duration"));
        c.setCourseFee(Double.parseDouble(req.getParameter("fee")));

        new CourseService().updateCourse(c); // ⭐ used

        resp.sendRedirect("viewCourses");
    }
}