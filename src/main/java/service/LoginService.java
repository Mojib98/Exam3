package service;

import Entity.Doctor;
import Entity.Patient;
import org.hibernate.SessionFactory;
import repository.LoginRepository;
import service.imp.SessionFactorySingleton;

public class LoginService {
    SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
    LoginRepository loginRepository = new LoginRepository();
    public Boolean isDoctor(String name,Integer id){
        Doctor doctor=null;
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                doctor=loginRepository.doctor(name,id);
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
        if (doctor !=null){
            return true;
        }else {
            return false;
        }
    }
    public boolean isPatient(String name ,Integer id){
        Patient patient=null;
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                patient = loginRepository.patient(name,id);
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
        if (patient !=null){
            return true;
        }else {
            return false;
        }
    }
}
