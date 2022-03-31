package service;

import Entity.BaseClass;
import Entity.Doctor;

public interface DoctorInf<T extends BaseClass> extends Service<Doctor>{
    void prescriptionWrite(T t);
    void AddTime();
}
