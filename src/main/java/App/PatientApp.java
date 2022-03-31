package App;

import Entity.Doctor;
import Entity.Patient;
import service.imp.PatientService;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PatientApp {
    PatientService patientService = new PatientService();
    Scanner scanner = new Scanner(System.in);
    public void singUp(){
        Patient patient= new Patient();
        System.out.println("please insert name");
        String name= scanner.next().trim();
        patient.setName(name);
        patientService.add(patient);
        //exception illegal insert
    }
    public void seeAllDoctor(){
       List<Doctor> list= patientService.allDoctor();
       list.forEach(System.out::println);
    }

}
