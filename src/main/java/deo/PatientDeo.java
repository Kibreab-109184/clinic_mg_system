package deo;

import model.Address;
import model.Patient;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PatientDeo {

   private static Map<String, Patient> patientMap = new HashMap<>();

    static {
        Address address = new Address("2000 North court street", "Fairfield", "IA", "52556");
        patientMap.put("3001", new Patient("3001", "Kibreab", "Tomas", LocalDate.of(2018,9,25),address, "merimemax@gmail.com", "(862) 704 -4056",null ));
        patientMap.put("3002", new Patient("3002", "Kibreab", "Tomas", LocalDate.of(2018,9,25),address, "merimemax@gmail.com", "(862) 704 -4056",null ));
        patientMap.put("3003", new Patient("3003", "Kibreab", "Tomas", LocalDate.of(2018,9,28),address, "merimemax@gmail.com", "(862) 704 -4056",null ));
        patientMap.put("3004", new Patient("3004", "Kibreab", "Tomas", LocalDate.of(2018,9,27),address, "merimemax@gmail.com", "(862) 704 -4056", null));
        patientMap.put("3005", new Patient("3005", "Kibreab", "Tomas", LocalDate.of(2018,9,25),address, "merimemax@gmail.com", "(862) 704 -4056",null ));
        patientMap.put("3006", new Patient("3006", "Kibreab", "Tomas", LocalDate.of(2018,9,26),address, "merimemax@gmail.com", "(862) 704 -4056",null ));

    }



    public static List<Patient> getPatientList(String id) {
        List<Patient> plist = patientMap.values().stream().filter(e-> e.getDob().equals(LocalDate.now())).collect(Collectors.toList());

        for (Patient p : plist) {
            System.out.println("Key " + p.getId() + " and Value " + p.getFirst_name());
        }
        return plist;
    }

    public static void setPatientMap(Map<String, Patient> patientMap) {
        PatientDeo.patientMap = patientMap;
    }
}
