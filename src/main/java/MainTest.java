import repository.imp.PatientRepo;
import service.imp.PatientService;

import java.sql.Time;
import java.time.LocalTime;

public class MainTest {
    public static void main(String[] args) {
      /*  LocalTime localTime = LocalTime.of(12, 12, 12);
        System.out.println(localTime);*/
        PatientService patientService = new PatientService();
        var s=patientService.allDoctor();
        System.out.println(s);
    }
}
