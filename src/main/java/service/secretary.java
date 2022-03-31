package service;

import Entity.BaseClass;

import java.time.LocalTime;

public interface secretary extends Service<BaseClass>{
    void addTime(LocalTime start,LocalTime end);
}
