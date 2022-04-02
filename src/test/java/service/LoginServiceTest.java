package service;

import Entity.Doctor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginServiceTest {
    LoginService loginService = new LoginService();

    @Test
    void isDoctor() {
        String name ="m32";
        Integer id = 12;
       Boolean c= loginService.isDoctor(name,id);
        assertEquals(false,c);
    }

    @Test
    void isPatient() {
        String name ="m32";
        Integer id = 12;
        Boolean c= loginService.isPatient(name,id);
        assLertEquals(false,c);
    }

    private void assLertEquals(boolean b, Boolean c) {
    }
}