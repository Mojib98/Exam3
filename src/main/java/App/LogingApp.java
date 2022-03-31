package App;

import service.LoginService;

public class LogingApp {
    LoginService loginService = new LoginService();
    public Boolean doctor(String name,Integer id){
        return loginService.isDoctor(name,id);
    }
    public boolean patient(String name,Integer id){
        return loginService.isPatient(name,id);
    }
}
