package service.imp;

import Entity.Clinic;
import Entity.Doctor;
import Entity.Patient;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.imp.SecretaryRepository;
import repository.patientRepo;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PatientServiceTest {
   static Patient patient;
   static Clinic clinic;
   static PatientService patientService;
    static SessionFactory sessionFactory = SessionFactorySingleton.getInstance();


    @BeforeAll
    void insert(){
        patient =new Patient(null,"JackM2",null);
        clinic =new Clinic(null,"testClinic");
        patientService = new PatientService();
    }
    @BeforeEach
    void adding(){
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
               session.save(patient);
               session.save(clinic);
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }
    }
    @AfterEach
    void removingData(){
        try (var session = sessionFactory.getCurrentSession()) {
            var t = session.getTransaction();
            try {
                t.begin();
                session.remove(patient);
                session.remove(clinic);
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
            }
        }

    }


    @Test
    void allClink() {
        List<Clinic> list=null;
        list = patientService.allClink();
        assertNotNull(list);
    }

    @Test
    void allDoctor() {
        List<Doctor> list=null;
        list = patientService.allDoctor();
        assertNotNull(list);
    }

    @Test
    void myPrescription() {
    }

    @Test
    void giveTime() {
    }

    @Test
    void add() {
    }

    @Test
    void modify() {
    }

    @Test
    void delete() {
    }

    @Test
    void showAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void changeTime() {
    }

    @Test
    void findByIdP() {
    }

    @Test
    void chaneDoctorTime() {
    }

    @Test
    void myVisit() {
    }

    @Test
    void cancel() {
    }
}