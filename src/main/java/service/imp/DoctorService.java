package service.imp;

import Entity.Prescription;
import Entity.Visit;
import lombok.Setter;
import org.hibernate.SessionFactory;
import repository.imp.DoctorRepository;

import java.util.List;
@Setter
public class DoctorService {
  private  final   SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
   private final repository.DoctorRepository doctorRepository = new DoctorRepository();
    private Integer id;

    public List<Visit> seeVisit() {
        List<Visit> list = null;
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                list=doctorRepository.seeVisit(this.id);
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
        return list;
    }

    public void writePrescription(Prescription prescription) {
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                doctorRepository.writePrescription(prescription);
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
    }

    public List<Prescription> seePrescription() {
        List<Prescription> list = null;
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                list=doctorRepository.seePrescription(this.id);
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
        return list;
    }

    public void modifyPrescription(Prescription prescription) {
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                doctorRepository.modifyPrescription(prescription);
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
    }

    private void deleteVisit(int id) {
        Prescription prescription = new Prescription();
        prescription.setId(id);
        prescription.setExpired(false);
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
               doctorRepository.modifyPrescription(prescription);
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
    }
}


