package App;

import Entity.Clinic;
import Entity.Doctor;
import service.imp.SecretaryService;

import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

public class SecretaryApp {
    SecretaryService secretaryService = new SecretaryService();
    Scanner scanner = new Scanner(System.in);
    public void addDoctor(){
        System.out.println("please insert name");
        String name = scanner.next().trim();
        System.out.println("insert specialty");
        String s = scanner.next().trim().toLowerCase(Locale.ROOT);
        System.out.println("insert capacity ");
        int capa= scanner.nextInt();
        System.out.println("insert time to start work h");
        int hS=scanner.nextInt();
        System.out.println("insert time to start work m");
        int mS=scanner.nextInt();
        System.out.println("insert time to End work h");
        int hE=scanner.nextInt();
        System.out.println("insert time to End work h");
        int mE=scanner.nextInt();
        LocalTime StartTime = LocalTime.of(hS, mS, 0);
        LocalTime endTime = LocalTime.of(hE, mE, 0);
        System.out.println("plese insert id of clinic");
        int id=scanner.nextInt();
        Clinic clinic = new Clinic(id,null);
        Doctor doctor = new Doctor(name,s,capa,StartTime,endTime,clinic);
        secretaryService.add(doctor);

    }
    public void addClinic(){
        System.out.println("insert name");
        String name = scanner.next().trim();
        Clinic clinic = new Clinic(null,name);
        secretaryService.add(clinic);


    }
    public void seeAllPatient(){}
    public void seeAllDoctor(){}
    public void seeAllClinic(){}
    public void seeAllVisit(){}
}
