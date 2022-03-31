package repository;

import Entity.Clinic;
import Entity.Doctor;
import Entity.Patient;
import Entity.Prescription;

import java.util.List;

public interface patientRepo extends Repository<Patient> {
    List<Clinic> allClink();
    List<Doctor> allDoctor();
    List<Prescription> myPrescription(Integer id);
    void giveTime(Doctor doctor);
}
