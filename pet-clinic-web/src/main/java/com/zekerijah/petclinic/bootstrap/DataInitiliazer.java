package com.zekerijah.petclinic.bootstrap;

import com.zekerijah.petclinic.model.Owner;
import com.zekerijah.petclinic.model.Vet;
import com.zekerijah.petclinic.services.OwnerService;
import com.zekerijah.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class DataInitiliazer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInitiliazer(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Jon");
        owner1.setLastName("Doe");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jane");
        owner2.setLastName("Doe");

        ownerService.save(owner2);

        Vet veterinarian1 = new Vet();
        veterinarian1.setFirstName("Ivor");
        veterinarian1.setLastName("Driscoll");

        vetService.save(veterinarian1);

        Vet veterinarian2 = new Vet();
        veterinarian2.setFirstName("Sia");
        veterinarian2.setLastName("Findlay");

        vetService.save(veterinarian2);

        System.out.println(veterinarian1 + " " + veterinarian2);
    }
}
