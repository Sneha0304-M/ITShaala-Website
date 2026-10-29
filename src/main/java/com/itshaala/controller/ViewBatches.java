package com.itshaala.controller;

import com.itshaala.service.BatchService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/viewBatches")
public class ViewBatches extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setAttribute("batchList", new BatchService().getBatches());
        req.getRequestDispatcher("Batch/viewBatches.jsp").forward(req, resp);
    }
}