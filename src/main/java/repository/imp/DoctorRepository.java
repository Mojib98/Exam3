package repository.imp;

import Entity.Visit;
import org.hibernate.SessionFactory;
import service.imp.SessionFactorySingleton;

import java.util.List;

public class DoctorRepository {
    SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    public void seeVisit(int id){
        List<Visit> list = null;
        var session = sessionFactory.getCurrentSession();
        String hql = " from Entity.Visit " +
                "where doctor.id=:id";
        var query = session.createQuery(hql,Visit.class);
        query.setParameter("id",id);
        list = query.getResultList();
        return list;

    }
    public void writePrescription(){}
    public void seePrescription(){}
    public void modifyPrescription(){}
}
