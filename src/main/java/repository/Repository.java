package repository;

import Entity.BaseClass;

import java.util.List;

public interface Repository <T extends BaseClass> {
    void add(T t);
    void modify(T t);
    void delete(T t);
    List<T> showAll();
}
