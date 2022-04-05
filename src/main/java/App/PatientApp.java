package App;

import Entity.Clinic;
import Entity.Doctor;
import Entity.Patient;
import Entity.Visit;
import service.PatientInterface;
import service.imp.PatientService;

import java.util.List;
import java.util.Scanner;

public class PatientApp {
    private Integer idP;
    PatientInterface patientService = new PatientService();
    Scanner scanner = new Scanner(System.in);

    public void singUp() {
        try {
            Patient patient = new Patient();
            System.out.println("please insert name");
            String name = scanner.next().trim();
            checkName(name);
            patient.setName(name);
            patientService.add(patient);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
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

    public void getTime() {
        System.out.println("insert id doctor");
        int idD = scanner.nextInt();
        Doctor doctor = setDoctor(idD);
        doctor = patientService.changeTime(doctor);
        Patient patient = findByIdP();
        if (doctor != null) {
            Visit visit = new Visit(doctor, patient, doctor.getStartWork());
            patientService.giveTime(visit);
            System.out.println("your time insert");

        } else System.out.println("can't");
    }

    public Patient findByIdP() {
        return patientService.findByIdP(this.idP);
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
        System.out.println("please select by id");
        Integer idVisit=scanner.nextInt();
        try {
            patientService.cancel(idVisit, this.idP);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doctorOfClinic(Integer id) {
    }

    public void checkName(String name) {
        if (name.length() < 3)
            throw new RuntimeException("name should be more than 2 character!");
        for (Character ch : name.toCharArray()
        ) {
            if (Character.isDigit(ch))
                throw new RuntimeException("name can not have number!");
        }
        for (Character ch : name.toCharArray()
        ) {
            if (!Character.isAlphabetic(ch))
                throw new RuntimeException("name can't have Sign(!,@,#,%,...)");
        }
    }

}
