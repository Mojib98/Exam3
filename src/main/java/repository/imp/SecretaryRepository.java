package repository.imp;

import Entity.BaseClass;
import Entity.Clinic;
import Entity.Doctor;
import Entity.Patient;
import org.hibernate.SessionFactory;
import repository.Repository;
import service.imp.SessionFactorySingleton;

import java.util.List;

public class SecretaryRepository implements Repository<BaseClass> {
    SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    @Override
    public void add(BaseClass baseClass) {
        var session = sessionFactory.getCurrentSession();
        session.save(baseClass);

    }

    @Override
    public void modify(BaseClass baseClass) {
        var session = sessionFactory.getCurrentSession();
        session.delete(baseClass);

    }

    @Override
    public void delete(BaseClass baseClass) {
        var session = sessionFactory.getCurrentSession();
        session.delete(baseClass);

    }

    @Override
    public List<BaseClass> showAll() {
        return null;
    }

    public List<Clinic> allClink() {
        List<Clinic> list=null;
        var session = sessionFactory.getCurrentSession();
        String hql="select c.id,c.nameClinic  from Clinic c";
        var query=session.createQuery(hql,Clinic.class);
        list=query.getResultList();
        return list;
    }


    public List<Doctor> allDoctor() {
        List<Doctor> list=null;
        var session = sessionFactory.getCurrentSession();
        String hql="select d.id,d.name,d.startWork,d.endWork,d.specialty from Doctor d";
        var query=session.createQuery(hql,Doctor.class);
        list=query.getResultList();
        return list;
    }
    public List<Patient> allPatient() {
        List<Patient> list=null;
        var session = sessionFactory.getCurrentSession();
        String hql="select p.name,p.id,p.prescriptions from Patient p";
        var query=session.createQuery(hql,Patient.class);
        list=query.getResultList();
        return list;
    }
}
