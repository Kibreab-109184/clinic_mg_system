package model;


import deo.DoctorsDeo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Doctor extends Person{

    private DoctorSpecializations specialization;
    private String description;
    private String clinicserviceId;

    public Doctor() {
    }

    public Doctor(String id, String first_name, String last_name, LocalDate dob, Address address, String email, String phoneNumber, String clinicserviceId) {
        super(id,first_name, last_name, dob, address, email, phoneNumber);
        this.clinicserviceId = clinicserviceId;

    }

    public static List<Doctor> getDoctorsList(String serviceId) {
        System.out.println("this is not implemented ");
        return new ArrayList<>();
    }

    public static List<Doctor> getDoctorByClinicServicId(String doc_id) {
        List<Doctor> doctorList = Doctor.doctorList();
        return doctorList.stream().filter(doc -> doc.clinicserviceId.equals(doc_id)).collect(Collectors.toList());
    }

    public DoctorSpecializations getSpecialization() {
        return specialization;
    }

    public void setSpecialization(DoctorSpecializations specialization) {
        this.specialization = specialization;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClinicserviceId() {
        return clinicserviceId;
    }

    public void setClinicserviceId(String clinicserviceId) {
        this.clinicserviceId = clinicserviceId;
    }

    public static List<Doctor> doctorList(){
        Map<String, Doctor> doclist = DoctorsDeo.getDoctors();
        List<Doctor> doct = new ArrayList<>();

        for(String key: doclist.keySet()){
            doct.add(doclist.get(key));
        }
        return doct;
    }

    public static void deleteDoctorById(String id){
        DoctorsDeo.deleteDoctorById(id);
    }

    public static Doctor getDoctorById(String doc_id){
       return DoctorsDeo.getDoctorById(doc_id);
    }

}
