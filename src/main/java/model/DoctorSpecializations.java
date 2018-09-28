package model;

import java.util.ArrayList;
import java.util.List;

public class DoctorSpecializations {

    private String id;
    private String name;
    private String description;
    private String catImg_url;

    private List<Doctor> doctorList;

    public DoctorSpecializations() {
        doctorList = new ArrayList<>();
    }

    public DoctorSpecializations(String name, String description, String catImg_url) {
        this.name = name;
        this.description = description;
        this.catImg_url = catImg_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCatImg_url() {
        return catImg_url;
    }

    public void setCatImg_url(String catImg_url) {
        this.catImg_url = catImg_url;
    }

    public Doctor getDoctor(String id){

       for(Doctor doc: doctorList){
           if (doc.getId().equals(id)){
               return  doc;
           }
       }
        return new Doctor();//null
    }

    public void addDoctor(Doctor doctor){
        doctorList.add(doctor);
    }
}
