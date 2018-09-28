package controller;

import model.Doctor;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/doctors_list")
public class DoctorsListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


//        String serviceId = req.getAttribute("serviceId").toString();
        String serviceId = "4";

        System.out.println("this is called by clicking get " + serviceId);
        List<Doctor> doctorList = Doctor.getDoctorsList(serviceId);

        doctorList.forEach(doctor -> System.out.println(doctor.getClinicserviceId() +" " + doctor.getFirst_name()));

        req.getSession().setAttribute("dclist", doctorList);

//        req.getSession().setAttribute("clinic_services", model.ClinicService.getClinicServices());
        RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/views/clinicService.jsp");
        view.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("this is called by clicking post ");
    }
}
