package App;

import Entity.Doctor;
import Entity.Patient;
import Entity.Prescription;
import Entity.Visit;
import service.imp.DoctorService;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class DoctorApp {
    private Integer id;
    private DoctorService doctorService = new DoctorService();
    Doctor doctor;
    Scanner scanner = new Scanner(System.in);

    public void setId(Integer id) {
        this.id = id;
        doctorService.setId(id);
    }

    public void seeVisit() {
        List<Visit> list = doctorService.seeVisit();
        for (Visit v : list) {
            System.out.println(v.getDoctor().getName() + " " + v.getPatient().getName() +
                    " " + v.getTime());
        }
    }

    public void writePrescription() {
        System.out.println("select id number patient");
        int idP = scanner.nextInt();
        List<Visit> list = doctorService.seeVisit();
        Patient patient = null;
        for (Visit v : list) {
            if (v.getPatient().getId().equals(idP)) {
                patient = v.getPatient();
                doctor = v.getDoctor();
                break;
            }
        }
        if (doctor != null & patient != null) {
            System.out.println("insert ");
            String pre = scanner.next().trim();
            Prescription prescription = new Prescription(pre, patient, doctor, new Date(System.currentTimeMillis()), Boolean.FALSE);
            doctorService.writePrescription(prescription);
        } else System.out.println("cant");

    }

    public void seePrescription() {
        List<Prescription> list = null;
        list=doctorService.seePrescription();
        if (list !=null){
            list.forEach(System.out::println);
        }
    }

    public void modifyPrescription() {


    }
}
