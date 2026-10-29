package com.itshaala.controller;

import com.itshaala.model.Batch;
import com.itshaala.service.BatchService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/editBatch")
public class EditBatch extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        req.setAttribute("batch", new BatchService().getBatchById(id));
        req.getRequestDispatcher("/Batch/editBatch.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        Batch b = new Batch();
        b.setBatchId(Integer.parseInt(req.getParameter("id")));
        b.setBatchName(req.getParameter("batchName"));
        b.setStartDate(req.getParameter("startDate"));
        b.setEndDate(req.getParameter("endDate"));
        b.setTrainerName(req.getParameter("trainer"));
        b.setBatchTiming(req.getParameter("timing"));
        b.setCourseId(Integer.parseInt(req.getParameter("courseId")));

        new BatchService().updateBatch(b);
        resp.sendRedirect("viewBatches");
    }
}