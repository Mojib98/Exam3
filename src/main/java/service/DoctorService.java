package service;

import Entity.Prescription;
import Entity.Visit;

import java.util.List;

public interface DoctorService {
    List<Visit> seeVisit();

    void writePrescription(Prescription prescription);

    List<Prescription> seePrescription();

    void modifyPrescription(Prescription prescription);

    void deleteVisit(int id);
}
