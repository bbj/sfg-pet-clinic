package com.bbj.sfgpetclinic.bootstrap;

import com.bbj.sfgpetclinic.model.Owner;
import com.bbj.sfgpetclinic.model.Vet;
import com.bbj.sfgpetclinic.services.OwnerService;
import com.bbj.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*
    1. Making it a @Component, it will be created as a Singleton in the Spring context
    2. Then when the context is ready, the method run() is called
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    // BAD: we dont want this dependency on implementation classes
    //    public DataLoader() {
    //        ownerService = new OwnerServiceMap();
    //        vetService = new VetServiceMap();
    //    }

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
