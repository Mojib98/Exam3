package repository;

import Entity.Doctor;
import Entity.Patient;
import org.hibernate.SessionFactory;
import service.imp.SessionFactorySingleton;

public class LoginRepository {
    SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    public Doctor doctor(String name,Integer id){
    var session = sessionFactory.getCurrentSession();
    String hql =  "from Entity.Doctor " +
            "where id=:id and name =: name";
    var query = session.createQuery(hql,Doctor.class);
        query.setParameter("name",name);
        query.setParameter("id",id);
    Doctor result = query.uniqueResult();
      return  result;


    }

    public Patient patient(String name, Integer id){
        var session = sessionFactory.getCurrentSession();
        String hql =  "from Entity.Patient " +
                "where id=:id and name =: name";
        var query = session.createQuery(hql,Patient.class);
        query.setParameter("name",name);
        query.setParameter("id",id);
        Patient result = query.uniqueResult();
        return  result;


    }

    }


