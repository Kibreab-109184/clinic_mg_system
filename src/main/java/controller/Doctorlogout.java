package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//@WebServlet("/logout_Doc")
public class Doctorlogout extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("I am here to go to doctor page");

        HttpSession session = request.getSession();
        session.removeAttribute("username");
        session.invalidate();
        RequestDispatcher despa = request.getRequestDispatcher("WEB-INF\\views\\doctor\\doctor.jsp");
        despa.forward(request, response);
        System.out.println("I visited to doctor page");
       //response.sendRedirect("WEB-INF/views/doctor/doctor.jsp");
    }
}
