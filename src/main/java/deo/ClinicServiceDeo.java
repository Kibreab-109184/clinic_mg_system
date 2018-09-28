package deo;

import model.ClinicService;
import java.util.HashMap;
import java.util.Map;

public class ClinicServiceDeo {
    private static Map<String, ClinicService> clinicServiceMap = new HashMap<>();

    static {
        clinicServiceMap.put("1", new ClinicService("1", "Dental", "we give Dental services which is the best to you and your family","resources/img/clinicServiceImages/dentist.jpg"));
        clinicServiceMap.put("2", new ClinicService("2", "Dermatology", "Well trained Doctorswith great experience provides treatment","resources/img/clinicServiceImages/derm.jpg"));
        clinicServiceMap.put("3", new ClinicService("3", "Dialysis", "The most expert physcians Provides in-paitient dialysis ","resources/img/clinicServiceImages/images.jpeg"));
        clinicServiceMap.put("4", new ClinicService("4", "Ambulatory care", "Ambulatory Care provides services  where you can go home the same day.","resources/img/clinicServiceImages/ambu.jpg"));
        clinicServiceMap.put("5", new ClinicService("5", "Dietitian", " MsquareK provides a variety of evidence-based nutrition services.","resources/img/clinicServiceImages/diet.jpg"));
        clinicServiceMap.put("6", new ClinicService("6", "Radiology", "The radiology department at MsquareK  offers a variety of imaging services .","resources/img/clinicServiceImages/radio.jpg"));
        clinicServiceMap.put("7", new ClinicService("7", "cardiology", "When it comes to cardiac rehabilitation support programs.","resources/img/clinicServiceImages/cardio.jpg"));
        clinicServiceMap.put("8", new ClinicService("8", "Speech Therapy", "The Speech Therapy Department works with the evaluation and treatment","resources/img/clinicServiceImages/Therapy.jpg"));
        clinicServiceMap.put("9", new ClinicService("9", "Optometry", "we provide comprehensive Contact Lens, Pediatric and Senior Eye Exams.","resources/img/clinicServiceImages/opt.jpg"));

    }



    public static ClinicService getClinicServiceById(String key) {
        return clinicServiceMap.get(key);
    }

    public static void addClinicService(ClinicService clinicService) {
        clinicServiceMap.put(clinicService.getClinicserviceId(), clinicService);
    }

    public static Map<String, ClinicService> getClinicServiceMap() {
        return clinicServiceMap;
    }

    public static void setClinicServiceMap(Map<String, ClinicService> clinicServiceMap) {
        ClinicServiceDeo.clinicServiceMap = clinicServiceMap;
    }

    public static void deleteServiceById(String id){
        clinicServiceMap.remove(id);
    }
}
