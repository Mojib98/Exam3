package service.imp;

import Entity.Visit;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.function.Predicate;

public class DoctorService {
    SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    private Integer id;

    public List<Visit> seeVisit() {
        List<Visit> list = null;
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
        return list;
    }



    public void writePrescription() {
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

    public List<Predicate> seePrescription() {
        List<Predicate> list = null;
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
        return list;
    }

    public void modifyPrescription() {
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

    private void deleteVisit(int id) {
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
}


