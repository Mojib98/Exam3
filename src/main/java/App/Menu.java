package App;

import java.util.Scanner;

public class Menu {
    private Integer id;
    private String name;
    Scanner scanner = new Scanner(System.in);
    PatientApp patientApp = new PatientApp();
    DoctorApp doctorApp = new DoctorApp();
    public void menu(){

    }
    public void singUp(){
        patientApp.singUp();
    }
    private void admin(){
        SecretaryApp secretaryApp = new SecretaryApp();
        boolean isRun=true;
        while (isRun)
        System.out.println(
                "\tfor add doctor insert 1\n" +
                "\tfor add clinic insert 2\n" +
                "\tfor see All doctor insert 3\n" +
                "\tfor see All clinic insert 4\n" +
                "\tfor see All patient insert 5\n" +
                "\tfor see All visit insert 6\n" +
                "\tfor see All prescription insert 7\n");
        int section=scanner.nextInt();
        switch (section){
            case 1:
                secretaryApp.addDoctor();
                break;
            case 2:
                secretaryApp.addClinic();
                break;
            case 3:
                secretaryApp.seeAllDoctor();
                break;
            case 4:
                secretaryApp.seeAllClinic();
                break;
            case 5:
                secretaryApp.seeAllPatient();
                break;
            case 6:
                secretaryApp.seeAllVisit();
                break;
            case 7:
            case 8:
                isRun=false;
        }
    }
    private void patient(){
        patientApp.setIdP(this.id);
        boolean isRun=true;
        while (isRun){
            System.out.println("" +
                    "\tfor see All doctor insert 1\n" +
                    "\tfor see All clinic insert 2\n" +
                    "\tfor see doctor of clinic insert 3\n" +
                    "\tfor give time insert 4\n" +
                    "for see All your time insert 5\n" +
                    "for cancel your visit insert 6\n" +
                    "for see All your prescription 7\n" +
                    "for exit insert 8" +
                    "");
            int section=scanner.nextInt();
            switch (section){
                case 1:
                    patientApp.seeAllDoctor();
                    break;
                case 2:
                    patientApp.seeAllClinic();
                    break;
                case 3:

                case 4:
                    patientApp.seeAllDoctor();
                    System.out.println("insert id doctor");
                    int idD=scanner.nextInt();
                    patientApp.getTime(idD);
                case 5:
                case 6:
                case 7:
                case 8:
                    isRun=false;
            }



        }
    }
    private void doctor(){
        patientApp.setIdP(this.id);
        Boolean isRun=true;
        while (isRun){
            System.out.println(
                    "\tfor see your visit insert 1\n" +
                    "\tfor see your patient inset 2\n" +
                    "\tfor insert prescription insert 3\n" +
                    "\tfor see your prescription insert 4\n" +
                    "\tfor modify prescription insert 5\n" +
                    "\tfor see your information insert 6\n");
            int section = scanner.nextInt();
            switch (section){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    isRun=false;
                    break;
            }



        }
    }
}
