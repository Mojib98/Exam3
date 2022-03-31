package service.imp;

import Entity.*;
import org.hibernate.SessionFactory;
import repository.imp.PatientRepo;
import service.PatientInterface;

import java.util.List;

public class PatientService implements PatientInterface {
    SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
    PatientRepo patientRepo = new PatientRepo();

    @Override
    public List<Clinic> allClink() {
        List<Clinic> list = null;
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                list = patientRepo.allClink();
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
        return list;
    }

    @Override
    public List<Doctor> allDoctor() {
        List<Doctor> list = null;
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                list = patientRepo.allDoctor();
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
        return list;
    }

    @Override
    public List<Prescription> myPrescription(Integer id) {
        List<Prescription> list = null;
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                list = patientRepo.myPrescription(id);
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
        return list;
    }

    @Override
    public void giveTime(Visit visit) {
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                patientRepo.giveTime(visit);
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }

    }

    @Override
    public void add(Patient patient) {
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                patientRepo.add(patient);
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }

    }

    @Override
    public void modify(Patient patient) {
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                patientRepo.modify(patient);

                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }

    }

    @Override
    public void delete(Patient patient) {
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                patientRepo.delete(patient);

                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }

    }

    @Override
    public List<Patient> showAll() {
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
        return null;
    }

    public Doctor findById(Integer id) {
        Doctor doctor = null;
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                doctor = patientRepo.findById(id);
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
        return doctor;
    }

    public Doctor changeTime(Doctor doctor) {
        System.out.println(doctor.getStartWork().isBefore(doctor.getEndWork()));
        if (doctor.getStartWork().isBefore(doctor.getEndWork())) {
            doctor.changeTime();
            chaneDoctorTime(doctor);
        } else System.out.println("Time full");
        return null;
    }

    public Patient findByIdP(Integer id) {

        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                return patientRepo.findByIdP(id);
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
        return null;
    }

    public void chaneDoctorTime(Doctor doctor) {
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                patientRepo.chaneDoctorTime(doctor);
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
    }

}

