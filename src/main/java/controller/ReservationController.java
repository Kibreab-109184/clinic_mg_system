package controller;

import model.Appointment;
import model.Patient;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

public class ReservationController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Reservation Made");

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/reservation/reservation_form.jsp");
        rd.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String full_name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        LocalDate date = LocalDate.parse(req.getParameter("date"));
        String message = req.getParameter("message");

        Patient newPatient = new Patient(null,full_name, null, null,null, email, phone, message);

        Appointment appointment = new Appointment(newPatient.getId(),"5", date);
        Appointment.saveAppointment(appointment);



        System.out.println(full_name + " " + email + " " + phone + " date " + date);
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/reservation/reservation.jsp");
        rd.forward(req, resp);
    }
}
