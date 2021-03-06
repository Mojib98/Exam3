package App;

import Entity.*;
import service.imp.SecretaryService;

import java.time.LocalTime;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class SecretaryApp {
    SecretaryService secretaryService = new SecretaryService();
    Scanner scanner = new Scanner(System.in);

    public void addDoctor() {
        try {
            System.out.println("please insert name");
            String name = scanner.next().trim();
            System.out.println("insert specialty");
            String s = scanner.next().trim().toLowerCase(Locale.ROOT);
            System.out.println("insert capacity ");
            int capa = scanner.nextInt();
            System.out.println("insert time to start work h");
            int hS = scanner.nextInt();
            System.out.println("insert time to start work m");
            int mS = scanner.nextInt();
            System.out.println("insert time to End work h");
            int hE = scanner.nextInt();
            System.out.println("insert time to End work h");
            int mE = scanner.nextInt();
            LocalTime StartTime = LocalTime.of(hS, mS, 0);
            LocalTime endTime = LocalTime.of(hE, mE, 0);
            System.out.println("plese insert id of clinic");
            int id = scanner.nextInt();
            Clinic clinic = new Clinic(id, null);
            Doctor doctor = new Doctor(name, s, capa, StartTime, endTime, clinic);
            secretaryService.add(doctor);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void addClinic() {
        try {
            System.out.println("insert name");
            String name = scanner.next().trim();
            Clinic clinic = new Clinic(null, name);
            secretaryService.add(clinic);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void seeAllPatient() {
        try {
            List<Patient> list = secretaryService.showAllPatient();

            if (list != null) {
                list.forEach(System.out::println);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void seeAllDoctor() {
        try {
            List<Doctor> list = secretaryService.showAllDoctor();
            if (list != null) {
                list.forEach(System.out::println);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void seeAllClinic() {
        try {

            List<Clinic> list = secretaryService.showAllClinic();
            if (list != null) {
                list.forEach(System.out::println);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void seeAllVisit() {
        try {
            List<Visit> list = secretaryService.showAllVisit();
            for (Visit v : list) {
                System.out.println(v.getDoctor().getName() + " " + v.getPatient().getName() +
                        " " + v.getTime());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
