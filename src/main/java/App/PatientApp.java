package App;

import Entity.Clinic;
import Entity.Doctor;
import Entity.Patient;
import Entity.Visit;
import service.imp.PatientService;

import java.util.List;
import java.util.Scanner;

public class PatientApp {
    private Integer idP;
    PatientService patientService = new PatientService();
    Scanner scanner = new Scanner(System.in);

    public void singUp() {
        try {

            Patient patient = new Patient();
            System.out.println("please insert name");
            String name = scanner.next().trim();
            patient.setName(name);
            patientService.add(patient);
            //exception illegal insert
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void seeAllDoctor() {
        try {
            List<Doctor> list = patientService.allDoctor();

            if (list != null) {
                list.forEach(System.out::println);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void seeAllClinic() {
        try {
            List<Clinic> list = patientService.allClink();
            if (list != null) {
                list.forEach(System.out::println);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Doctor setDoctor(Integer id) {
        try {
            Doctor doctor = null;
            doctor = patientService.findById(id);
            return doctor;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void getTime(int ids) {
        Doctor doctor = setDoctor(ids);
        patientService.changeTime(doctor);
        Patient patient = findByIdP();
        if (doctor != null) {
            Visit visit = new Visit(doctor, patient, doctor.getStartWork().minusMinutes(15L));
            patientService.giveTime(visit);

        } else System.out.println("can't");
    }

    public Patient findByIdP() {
        Patient patient = patientService.findByIdP(this.idP);
        return patient;
    }

    public void setIdP(Integer idP) {
        this.idP = idP;
    }

    public void myVisit() {
        try {
            List<Visit> list = patientService.myVisit(this.idP);
            if (list != null) {
                list.forEach(System.out::println);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cancelVisit() {
    }

    public void doctorOfClinic(Integer id) {
    }

}
