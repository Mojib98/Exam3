package App;

import Entity.Clinic;
import Entity.Doctor;
import Entity.Patient;
import Entity.Visit;
import service.imp.PatientService;
import java.util.List;
import java.util.Scanner;

public class PatientApp {
    Integer idP;
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
    public void seeAllClinic(){
        List<Clinic> list= patientService.allClink();
        list.forEach(System.out::println);
    }
    public Doctor setDocter(Integer id){
        Doctor doctor=null;
        doctor = patientService.findById(id);
        return doctor;
    }
    public void getTime(int ids){
        System.out.println("select doctor by id");
        int id=scanner.nextInt();
        Doctor doctor = setDocter(id);
        patientService.changeTime(doctor);
        Patient patient = findByIdP();
        if (doctor!=null){
            Visit visit = new Visit(doctor,patient,doctor.getStartWork().minusMinutes(15L));
            patientService.giveTime(visit);

        }else System.out.println("can't");
    }
    public Patient findByIdP(){
        Patient patient = patientService.findByIdP(1);
        return patient;
    }
}
