package repository.imp;

import Entity.Clinic;
import Entity.Doctor;
import Entity.Patient;
import Entity.Prescription;
import org.hibernate.SessionFactory;
import repository.patientRepo;
import service.imp.SessionFactorySingleton;

import java.util.List;

public class PatientRepo implements patientRepo {
    SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    @Override
    public void add(Patient patient) {
        var session = sessionFactory.getCurrentSession();
        session.save(patient);


    }

    @Override
    public void modify(Patient patient) {
        var session = sessionFactory.getCurrentSession();
        session.update(patient);

    }

    @Override
    public void delete(Patient patient) {
        var session = sessionFactory.getCurrentSession();
        session.remove(patient);

    }

    @Override
    public List<Patient> showAll() {
        var session = sessionFactory.getCurrentSession();


        return null;
    }

    @Override
    public List<Clinic> allClink() {
        List<Clinic> list=null;
        var session = sessionFactory.getCurrentSession();
        String hql="select c.id,c.nameClinic  from Clinic c";
        var query=session.createQuery(hql,Clinic.class);
        list=query.getResultList();
        return list;
    }

    @Override
    public List<Doctor> allDoctor() {
        List<Doctor> list=null;
        var session = sessionFactory.getCurrentSession();
        String hql="select d.id,d.name,d.startWork,d.endWork,d.specialty, from Doctor d";
        var query=session.createQuery(hql,Doctor.class);
        list=query.getResultList();
        return list;
    }

    @Override
    public List<Prescription> myPrescription(Integer id) {
        var session = sessionFactory.getCurrentSession();

        return null;
    }

    @Override
    public void giveTime(Doctor doctor) {
        var session = sessionFactory.getCurrentSession();


    }
}
