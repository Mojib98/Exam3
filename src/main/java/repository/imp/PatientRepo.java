package repository.imp;

import Entity.*;
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
        String hql="select d.id,d.name,d.startWork,d.endWork,d.specialty from Doctor d";
        var query=session.createQuery(hql,Doctor.class);
        list=query.getResultList();
        return list;
    }

    @Override
    public List<Prescription> myPrescription(Integer id) {
        List<Prescription> list=null;
        var session = sessionFactory.getCurrentSession();
        String hql="from Entity.Prescription " +
                "where patient.id=:id";
        var query=session.createQuery(hql);
        query.setParameter("id",id);
        list=query.getResultList();
        return list;
    }

    @Override
    public void giveTime(Visit visit) {
        var session = sessionFactory.getCurrentSession();
        session.save(visit);

    }
    @Override
    public Patient info(Integer id){
        Patient patient=null;
        var session = sessionFactory.getCurrentSession();
        String hql="select p.id ,p.name from Patient p " +
                "where p.id=:id";
        var query = session.createQuery(hql,Patient.class);
        query.setParameter("id",id);
        patient=query.getSingleResult();
        return patient;
    }
    public Doctor findById(Integer id){
        var session = sessionFactory.getCurrentSession();

        Doctor doctor = null;
        doctor = session.find(Doctor.class,id);
        return doctor;
    }
}
