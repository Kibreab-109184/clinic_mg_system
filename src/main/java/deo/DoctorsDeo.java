package deo;


import model.Address;
import model.Doctor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoctorsDeo {

    private static Map<String, Doctor> doctors = new HashMap<>();

    public static Map<String, Doctor> getDoctors() {
        return doctors;
    }

    public static void setDoctors(Map<String, Doctor> doctors) {
        DoctorsDeo.doctors = doctors;
    }

    static {
        Address address = new Address("2000 North court street", "Fairfield", "IA", "52556");


        doctors.put("1006", new Doctor("1006", "Melat", "Gebreyohannes", LocalDate.of(1994, 03, 6), address, "merih@mum.edu", "862-704-4056", "1"));
        doctors.put("1007", new Doctor("1007", "Merry7", "Gebre", LocalDate.of(1990, 03, 7), address, "meliabe@mum.edu", "862-704-4056", "1"));
        doctors.put("1008", new Doctor("1008", "Maron", "Donald", LocalDate.of(1990, 03, 8), address, "merrymax@mum.edu", "862-704-4056", "1"));
        doctors.put("1009", new Doctor("1009", "Merih", "Sharuk", LocalDate.of(1990, 03, 7), address, "meh2018@mum.edu", "862-704-4056", "2"));
        doctors.put("1010", new Doctor("1010", "Bill", "Bob", LocalDate.of(1990, 03, 10), address, "m875great@mum.edu", "862-704-4056", "2"));
        doctors.put("1011", new Doctor("1011", "Bob", "Jhon", LocalDate.of(1990, 03, 9), address, "melon45@mum.edu", "862-704-4056", "2"));


        doctors.put("1012", new Doctor("1012", "Jhon", "Helvet", LocalDate.of(1990, 03, 23), address, "meki@mum.edu", "234-862-4056", "8"));
        doctors.put("1013", new Doctor("1013", "Jerry", "Geabril", LocalDate.of(1990, 03, 23), address, "rih@mum.edu", "829-704-4056", "8"));
        doctors.put("1014", new Doctor("1014", "Larry", "sherry", LocalDate.of(1990, 03, 23), address, "848ih@mum.edu", "990-704-4056", "3"));
        doctors.put("1015", new Doctor("1015", "Thomson", "Gebai", LocalDate.of(1990, 03, 23), address, "ethi784@mum.edu", "456-704-4056", "3"));
        doctors.put("1016", new Doctor("1016", "Barbra", "Barbra", LocalDate.of(1990, 03, 23), address, "coolman@mum.edu", "699-862-4056", "3"));

        doctors.put("1017", new Doctor("1017", "Makda", "Jospeh", LocalDate.of(1990, 03, 23), address, "abemel@mum.edu", "754-704-4056", "9"));
        doctors.put("1018", new Doctor("1018", "Henok", "Bill", LocalDate.of(1990, 03, 23), address, "sndkthe288@mum.edu", "262-704-5674", "9"));
        doctors.put("1019", new Doctor("1019", "Leno", "Bilard", LocalDate.of(1990, 03, 23), address, "how45@mum.edu", "405-704-4056", "9"));
        doctors.put("1020", new Doctor("1020", "Bernand", "Gebai", LocalDate.of(1990, 03, 23), address, "geniune@mum.edu", "345-862-4056", "4"));
        doctors.put("1021", new Doctor("1021", "Angelo", "Gedi", LocalDate.of(1990, 03, 23), address, "melania@mum.edu", "876-704-4056", "4"));
        doctors.put("1022", new Doctor("1022", "Tom", "hamlin", LocalDate.of(1990, 03, 23), address, "zaidg@mum.edu", "092-704-4056", "4"));
        doctors.put("1023", new Doctor("1023", "Merih23", "sandra", LocalDate.of(1990, 03, 23), address, "martha2017@mum.edu", "405-704-5674", "4"));


        doctors.put("1024", new Doctor("1024", "Merry", "Gesil", LocalDate.of(1990, 03, 23), address, "merih123@mum.edu", "984-704-4056", "5"));
        doctors.put("1025", new Doctor("1025", "Helen", "Santa", LocalDate.of(1990, 03, 23), address, "henk@mum.edu", "789-704-4056", "5"));
        doctors.put("1026", new Doctor("1026", "Lora", "hadi", LocalDate.of(1990, 03, 23), address, "123thebest@mum.edu", "854-704-5674", "5"));
        doctors.put("1027", new Doctor("1027", "Mavin", "Clinton", LocalDate.of(1990, 03, 23), address, "gerry@mum.edu", "712-704-4056", "7"));
        doctors.put("1028", new Doctor("1028", "Hawk", "habrion", LocalDate.of(1990, 03, 23), address, "merih@mum.edu", "866-704-4056", "7"));
        doctors.put("1029", new Doctor("1029", "Hilary", "Gist", LocalDate.of(1990, 03, 23), address, "rich12@mum.edu", "918-862-4056", "7"));


        doctors.put("1020", new Doctor("1020", "Bernand", "Gerry", LocalDate.of(1990, 03, 23), address, "hona123@mum.edu", "862-704-4056", "6"));
        doctors.put("1021", new Doctor("1021", "Angelo", "yohannes", LocalDate.of(1990, 03, 23), address, "erigirl@mum.edu", "4056-862-5674", "6"));
        doctors.put("1022", new Doctor("1022", "Tom", "hannes", LocalDate.of(1990, 03, 23), address, "Tiggirl@mum.edu", "405-704-4056", "6"));
    }

    public static List<Doctor> getDoctorsList() {
        List<Doctor> dlist = new ArrayList<>();
        for (String key : doctors.keySet()) {
            dlist.add(doctors.get(key));
        }

        return dlist;
    }


    public static void deleteDoctorById(String id) {

        doctors.remove(id);
    }

    public static Doctor getDoctorById(String doc_id) {
        return null;
    }
}
