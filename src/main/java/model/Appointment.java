package model;

import java.time.LocalDate;

public class Appointment {
    private String patientID;
    private String doctorID;
    private LocalDate appointmentDate;

    public Appointment() {
    }

    public Appointment(String patientID, String doctorID, LocalDate appointmentDate) {
        this.patientID = patientID;
        this.doctorID = doctorID;
        this.appointmentDate = appointmentDate;
    }

    public static void saveAppointment(Appointment appointment) {
        deo.AppointmentDeo.saveApt(appointment);
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

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
}
