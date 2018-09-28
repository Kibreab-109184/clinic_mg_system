package model;

import deo.PatientDeo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {
    private static String id = "0";
    List<PatientComment> comments;
    private String message;


    public Patient() {
        comments = new ArrayList<>();
    }

    public Patient(String id, String first_name, String last_name, LocalDate apointment_date, Address address, String email, String phone,String message) {
        super(id, first_name, last_name, apointment_date, address, email, phone);
        this.message = message;
    }


    public static List<Patient> getPatientList(String doc_id) {
        return PatientDeo.getPatientList(doc_id);
    }

    public static String getgenId() {
        int gen_id = Integer.parseInt(id);
        ++gen_id;
        return "" + gen_id;
    }

    public List<PatientComment> getComments() {
        return comments;
    }

    public void setComments(List<PatientComment> comments) {
        this.comments = comments;
    }
}
