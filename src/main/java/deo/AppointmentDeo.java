package deo;

import model.Appointment;

import java.util.ArrayList;
import java.util.List;

public class AppointmentDeo {
    private static List<Appointment> appointmentList = new ArrayList<>();

    public static void saveApt(Appointment appointment) {
        appointmentList.add(appointment);
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }
}
