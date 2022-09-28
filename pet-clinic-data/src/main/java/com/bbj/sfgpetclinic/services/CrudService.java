package com.bbj.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> { //<T, ID> generic like Spring's CrudRepository

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
