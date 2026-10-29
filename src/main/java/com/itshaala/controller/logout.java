package com.itshaala.controller;



import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/logout")
public class logout extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        HttpSession session = req.getSession(false);

        if(session != null){
            session.invalidate();   // 🔥 destroy session
        }

        resp.sendRedirect("login.jsp"); // go back to login
    }
}