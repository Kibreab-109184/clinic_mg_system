package model;

import deo.ClinicServiceDeo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ClinicService {

    private String clinicserviceId;
    private String clinicServiceName;
    private String description;
    private String clinicServiceImgUrl;
    private static List<ClinicService> serviceList = new ArrayList<>();

    public ClinicService() {
    }

    public ClinicService(String clinicserviceId, String clinicServiceName, String description, String clinicServiceImgUrl) {
        this.clinicserviceId = clinicserviceId;
        this.clinicServiceName = clinicServiceName;
        this.description = description;
        this.clinicServiceImgUrl = clinicServiceImgUrl;
    }

    public static List<ClinicService> getClinicServices() {
        Map<String, ClinicService> clinicService = ClinicServiceDeo.getClinicServiceMap();

        List<ClinicService> clinicServiceList = new ArrayList<>();
        for (String key : clinicService.keySet()) {
            clinicServiceList.add(clinicService.get(key));
        }

        serviceList.addAll(clinicServiceList);

        return clinicServiceList;
    }

    public  String getClinicserviceId() {
        return clinicserviceId;
    }

    public void setClinicserviceId(String clinicserviceId) {
        this.clinicserviceId = clinicserviceId;
    }

    public String getClinicServiceName() {
        return clinicServiceName;
    }

    public void setClinicServiceName(String clinicServiceName) {
        this.clinicServiceName = clinicServiceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClinicServiceImgUrl() {
        return clinicServiceImgUrl;
    }

    public void setClinicServiceImgUrl(String clinicServiceImgUrl) {
        this.clinicServiceImgUrl = clinicServiceImgUrl;
    }

    @Override
    public String toString() {
        return "ClinicService{" +
                "clinicserviceId='" + clinicserviceId + '\'' +
                ", clinicServiceName='" + clinicServiceName + '\'' +
                ", description='" + description + '\'' +
                ", clinicServiceImgUrl='" + clinicServiceImgUrl + '\'' +
                '}';
    }
}
