package controller;

import model.DocCredential;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class DoctorLogInController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");


            System.out.println("user name " + uname + " and password  " + pass);

            String doc_id = DocCredential.verifiy_user(new DocCredential(uname, pass));
            System.out.println(" docter id is verified " + doc_id);

            if (doc_id.equals(null)) {
                request.getSession().setAttribute("doct_Error", new ActButton("User Name and/or password is incorrect"));
                //    RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/doctor/doctor.jsp");
                // rd.forward(request, response);
                response.sendRedirect("/WEB-INF/views/doctor/doctor.jsp");

            } else {
//            request.getSession().setAttribute("doct_Error", new ActButton("User Name and/or password is incorrect"));
                HttpSession session = request.getSession();
                session.setAttribute("username", uname);
                RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/doctor/doctor_home_page.jsp");
                rd.forward(request, response);
            }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/doctor/doctor.jsp");
        rd.forward(request, response);
    }
}
