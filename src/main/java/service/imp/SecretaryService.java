package service.imp;

import Entity.*;
import org.hibernate.SessionFactory;
import repository.imp.SecretaryRepository;
import service.secretary;

import java.time.LocalTime;
import java.util.List;

public class SecretaryService implements secretary {
    SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
    SecretaryRepository secretaryRepository = new SecretaryRepository();
    @Override
    public void add(BaseClass baseClass) {
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                secretaryRepository.add(baseClass);
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
    }
    @Override
    public void modify(BaseClass baseClass) {
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
    }
    @Override
    public void delete(BaseClass baseClass) {
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

    }
    @Override
    public List<BaseClass> showAll() {
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
    @Override
    public void addTime(LocalTime start, LocalTime end) {
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

    }
    public List<Clinic> showAllClinic() {
        List<Clinic> list = null;
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                list=secretaryRepository.allClink();
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
        return list;
    }
    public List<Patient> showAllPatient() {
        List<Patient> list = null;
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                list=secretaryRepository.allPatient();
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
        return list;
    }
    public List<Doctor> showAllDoctor() {
        List<Doctor> list = null;
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                list=secretaryRepository.allDoctor();
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
        return list;
    }
    public  List<Visit> showAllVisit() {
        List<Visit> list = null;
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                list = secretaryRepository.allVisit();
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
        return list;
    }
    public List<Prescription> showAllPrescription() {
        List<Prescription> list  = null;
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
}
