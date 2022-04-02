package repository;

import Entity.Prescription;
import Entity.Visit;

import java.util.List;

public interface DoctorRepository {
    List<Visit> seeVisit(int id);

    void writePrescription(Prescription prescription);

    List<Prescription> seePrescription(Integer id);

    void modifyPrescription(Prescription prescription);
}
