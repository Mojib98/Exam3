package service.imp;

import Entity.Clinic;
import Entity.Doctor;
import Entity.Patient;
import Entity.Prescription;
import org.hibernate.SessionFactory;
import service.PatientInterface;

import java.util.List;

public class patientService implements PatientInterface {
    SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    @Override
    public List<Clinic> allClink() {
        return null;
    }

    @Override
    public List<Doctor> allDoctor() {
        return null;
    }

    @Override
    public List<Prescription> myPrescription(Integer id) {
        return null;
    }

    @Override
    public void giveTime(Doctor doctor) {

    }

    @Override
    public void add(Patient patient) {

    }

    @Override
    public void modify(Patient patient) {

    }

    @Override
    public void delete(Patient patient) {

    }

    @Override
    public List<Patient> showAll() {
        return null;
    }
}
