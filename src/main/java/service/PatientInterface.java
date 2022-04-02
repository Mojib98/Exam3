package service;

import Entity.*;

import java.util.List;

public interface PatientInterface extends Service<Patient> {
    List<Clinic> allClink();

    List<Doctor> allDoctor();

    List<Prescription> myPrescription(Integer id);

    void giveTime(Visit visit);

    void chaneDoctorTime(Doctor doctor);

    List<Visit> myVisit(Integer id);

    void cancel(Integer id, Integer patientId);

    Doctor findById(Integer id);

    Doctor changeTime(Doctor doctor);

    Patient findByIdP(Integer id);

}
