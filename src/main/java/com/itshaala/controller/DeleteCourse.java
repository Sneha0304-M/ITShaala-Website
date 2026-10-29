package com.itshaala.controller;

import com.itshaala.service.CourseService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/deleteCourse")
public class DeleteCourse extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        String idParam = req.getParameter("id");

        // 🛑 IMPORTANT SAFETY CHECK
        if(idParam == null || idParam.isEmpty()){
            resp.sendRedirect("viewCourses");
            return;
        }

        int id = Integer.parseInt(idParam);

        // 🛑 Prevent dangerous delete
        if(id <= 0){
            resp.sendRedirect("viewCourses");
            return;
        }

        CourseService service = new CourseService();
        service.deleteCourse(id);

        resp.sendRedirect("viewCourses");
    }
}