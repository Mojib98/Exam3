package service;

import Entity.*;

import java.time.LocalTime;
import java.util.List;

public interface secretary extends Service<BaseClass> {
    void addTime(LocalTime start, LocalTime end);

    List<Clinic> showAllClinic();

    List<Patient> showAllPatient();

    List<Doctor> showAllDoctor();

    List<Visit> showAllVisit();

    List<Prescription> showAllPrescription();
}
