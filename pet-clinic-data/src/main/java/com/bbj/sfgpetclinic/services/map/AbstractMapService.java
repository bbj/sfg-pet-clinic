package com.bbj.sfgpetclinic.services.map;

import com.bbj.sfgpetclinic.model.BaseEntity;

import java.util.*;

//<T extends BaseEntity, ID extends Long> => helps intelliJ to help us while typing
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    //if we use ID here vs Long, Collections.max(map.keySet()) + 1; will complain
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {

        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("object cannot be null!");
        }
        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(
                entry -> entry.getValue().equals(object)); //will need to implement equals for our classes
    }

    private Long getNextId() {

        if (map.size() == 0) {
            return 1L;
        }
        return Collections.max(map.keySet()) + 1;
    }
}
