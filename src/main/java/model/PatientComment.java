package model;

import java.time.LocalDate;

public class PatientComment {
    private String patientID;
    private String doctorID;
    private LocalDate comment_date;

    public PatientComment() {
    }

    public PatientComment(String doctorID, LocalDate comment_date) {
        this.doctorID = doctorID;
        this.comment_date = comment_date;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public LocalDate getDate() {
        return comment_date;
    }

    public void setDate(LocalDate comment_date) {
        this.comment_date = comment_date;
    }
}
