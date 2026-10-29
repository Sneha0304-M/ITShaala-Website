package com.itshaala.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet ("/login")
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        if("admin".equals(username) && "admin123".equals(password)){
            HttpSession session = req.getSession();
            session.setAttribute("user",username);

            resp.sendRedirect(req.getContextPath() + "/dashboard");
        }else {
            resp.getWriter().println("Invalid Login");
        }
        }
    }



