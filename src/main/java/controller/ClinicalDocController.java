package controller;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.ClinicService;
import model.Doctor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ClinicalDocController extends HttpServlet {
    ObjectMapper mapper = new ObjectMapper();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ActButton actButton = mapper.readValue(req.getParameter("doc"), ActButton.class);
        String doc_id = actButton.getAction();

        List<Doctor> doctors = Doctor.getDoctorByClinicServicId(doc_id);

        PrintWriter out = resp.getWriter();

        try {
            out.print(mapper.writeValueAsString(doctors));
        } catch (
                JsonGenerationException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
