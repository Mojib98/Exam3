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
    Doctor doctor1=new Doctor(id);
    Scanner scanner = new Scanner(System.in);

    public void setId(Integer id) {
        this.id = id;
        doctorService.setId(id);
    }

    public void seeVisit() {
        try {
            List<Visit> list = doctorService.seeVisit();

            for (Visit v : list) {
                System.out.println(v.getId()+"  "+v.getDoctor().getName() + " " + v.getPatient().getName() +
                        " " + v.getTime());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writePrescription() {
        try{
        System.out.println("select id number visit");
        int idP = scanner.nextInt();
        List<Visit> list = doctorService.seeVisit();
        Patient patient = null;
        for (Visit v : list) {
            if (v.getId().equals(idP)) {
                System.out.println(v);
                patient=v.getPatient();
                doctor = v.getDoctor();
                break;
            }
        }
        if (patient !=null & doctor !=null ) {
            System.out.println("insert ");
            String pre = scanner.next().trim();
            Prescription prescription = new Prescription(pre, patient, doctor, new Date(System.currentTimeMillis()), Boolean.FALSE);
            doctorService.writePrescription(prescription);
        } else System.out.println("cant");

    }catch (Exception e){
            e.printStackTrace();
        }}


    public void seePrescription() {
   try{     List<Prescription> list = null;
        list=doctorService.seePrescription();
        if (list !=null){
            list.forEach(System.out::println);
        }
    }catch (Exception e){
       e.printStackTrace();
   }}

    public void modifyPrescription() {


    }
}
