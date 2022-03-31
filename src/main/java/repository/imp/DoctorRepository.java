package repository.imp;

import Entity.Prescription;
import Entity.Visit;
import org.hibernate.SessionFactory;
import service.imp.SessionFactorySingleton;

import java.util.List;

public class DoctorRepository {
    SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    public List<Visit>  seeVisit(int id){
        List<Visit> list = null;
        var session = sessionFactory.getCurrentSession();
        String hql = " from Entity.Visit " +
                "where doctor.id=:id";
        var query = session.createQuery(hql,Visit.class);
        query.setParameter("id",id);
        list = query.getResultList();
        return list;

    }
    public void writePrescription(Prescription prescription){
        var session = sessionFactory.getCurrentSession();
        session.save(prescription);
    }
    public List<Prescription> seePrescription(Integer id){
        List<Prescription> list = null;
        var session = sessionFactory.getCurrentSession();
        String hql = " from Entity.Prescription " +
                "where doctor.id=:id";
        var query = session.createQuery(hql,Prescription.class);
        query.setParameter("id",id);
        list = query.getResultList();
        return list;



    }
    public void modifyPrescription(Prescription prescription){
        var session = sessionFactory.getCurrentSession();
        session.save(prescription);
    }
    private void delete(){}
}