package com.bbj.sfgpetclinic.services;

import com.bbj.sfgpetclinic.model.Pet;
import java.util.Set;

public interface PetService {
    //create methods similar to org.springframework.data.repository.CrudRepository methods
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
