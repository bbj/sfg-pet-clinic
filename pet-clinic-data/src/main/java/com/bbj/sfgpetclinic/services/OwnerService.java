package com.bbj.sfgpetclinic.services;

import com.bbj.sfgpetclinic.model.Owner;
import java.util.Set;

public interface OwnerService {

    //create methods similar to org.springframework.data.repository.CrudRepository methods
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
