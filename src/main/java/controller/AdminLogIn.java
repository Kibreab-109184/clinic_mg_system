package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class AdminLogIn extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("uname");
        String password = request.getParameter("psw");
//        String[] rememberme = request.getParameterValues("");
        if ("meley".equals(username) && "123".equals(password)) {

            Cookie loginCookie = new Cookie("user",username);
            //setting cookie to expiry in 30 mins
            loginCookie.setMaxAge(30*60);
            response.addCookie(loginCookie);

            request.getSession().setAttribute("username", username);
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/admin/adminhome.jsp");
            rd.forward(request, response);
            System.out.println("succesfull login");


        }else{
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/");
            PrintWriter out= response.getWriter();
            out.println("<font color=red>Either user name or password is wrong.</font>");
            rd.include(request, response);
        }
        System.out.println("this is called admin login post");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("this is called 2 admin login doget");
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/admin/adminlogin.jsp");
        rd.forward(request, response);
    }
}
