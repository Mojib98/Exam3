package service.imp;

import Entity.BaseClass;
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
}
