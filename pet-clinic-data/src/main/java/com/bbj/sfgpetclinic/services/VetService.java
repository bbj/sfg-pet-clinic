package com.bbj.sfgpetclinic.services;

import com.bbj.sfgpetclinic.model.Vet;
import java.util.Set;

public interface VetService {
    //create methods similar to org.springframework.data.repository.CrudRepository methods
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
