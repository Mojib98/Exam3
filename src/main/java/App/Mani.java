package App;

public class Mani {
    public static void main(String[] args) {
       /* PatientApp patientApp = new PatientApp();
        patientApp.singUp();*/
/*        SecretaryApp secretaryApp = new SecretaryApp();
        secretaryApp.addClinic();
        secretaryApp.addDoctor();*/
//        PatientApp patientApp = new PatientApp();
//        patientApp.setIdP(2);
//        patientApp.myVisit();
        DoctorApp doctorApp = new DoctorApp();
        doctorApp.setId(1);
        doctorApp.seePrescription();

    }
}
