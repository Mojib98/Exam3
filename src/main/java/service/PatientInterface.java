package service;

import Entity.*;

import java.util.List;

public interface PatientInterface extends Service<Patient>{
    List<Clinic> allClink();
    List<Doctor> allDoctor();
    List<Prescription> myPrescription(Integer id);
    void giveTime(Visit visit);

}
