package repository.imp;

import Entity.Doctor;
import Entity.Patient;
import Entity.Prescription;
import Entity.Visit;
import org.hibernate.SessionFactory;
import service.imp.SessionFactorySingleton;

import java.util.List;

public class DoctorRepository implements repository.DoctorRepository {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
    public List<Visit> seeVisit(int id) {
        List<Visit> list = null;
        var session = sessionFactory.getCurrentSession();
        String hql = "from  Entity.Visit  " +
                "where doctor.id=:id";
        var query = session.createQuery(hql, Visit.class);
        query.setParameter("id", id);
        list = query.getResultList();
        return list;

    }
    public void writePrescription(Prescription prescription) {
        var session = sessionFactory.getCurrentSession();
        session.save(prescription);
    }

    public List<Prescription> seePrescription(Integer id) {
        List<Prescription> list = null;
        var session = sessionFactory.getCurrentSession();
        String hql = "from Entity.Prescription " +
                "where doctor.id=:id";
        var query = session.createQuery(hql, Prescription.class);
        query.setParameter("id", id);
        list = query.getResultList();
        return list;


    }

    public void modifyPrescription(Prescription prescription) {
        var session = sessionFactory.getCurrentSession();
        session.update(prescription);
    }

    public void delete(Integer id) {
        var session = sessionFactory.getCurrentSession();
        String hql="delete from Entity.Visit " +
                "where id=:id";
        session.createQuery(hql)
                .setParameter("id",id)
                .executeUpdate();
    }
    public Doctor findDoctor(int id){
        var session = sessionFactory.getCurrentSession();
       return session.find(Doctor.class,id);
    }
    public Patient findPatent(String name){
        var session = sessionFactory.getCurrentSession();
        String hql = "from Entity.Patient where name=:name";
        var q = session.createQuery(hql,Patient.class);
        q.setParameter("name",name);
        return q.uniqueResult();
    }
    public void down(Integer id) {
        var session = sessionFactory.getCurrentSession();
        String hql="update from Entity.Visit set  idDone=true " +
                "where id=:id";
        session.createQuery(hql)
                .setParameter("id",id)
                .executeUpdate();
    }
}