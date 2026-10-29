package com.itshaala.controller;

import com.itshaala.model.Batch;
import com.itshaala.service.BatchService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/addBatch")
public class AddBatch extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        Batch b = new Batch();
        b.setBatchName(req.getParameter("batchName"));
        b.setStartDate(req.getParameter("startDate"));
        b.setEndDate(req.getParameter("endDate"));
        b.setTrainerName(req.getParameter("trainer"));
        b.setBatchTiming(req.getParameter("timing"));
        b.setCourseId(Integer.parseInt(req.getParameter("courseId")));

        new BatchService().addBatch(b);

        resp.sendRedirect("../dashboard");
    }
}
