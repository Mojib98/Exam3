package repository;

import Entity.*;

import java.util.List;

public interface patientRepo extends Repository<Patient> {
    List<Clinic> allClink();
    List<Doctor> allDoctor();
    List<Prescription> myPrescription(Integer id);
    void giveTime(Visit visit);
    Patient info(Integer id);
}
