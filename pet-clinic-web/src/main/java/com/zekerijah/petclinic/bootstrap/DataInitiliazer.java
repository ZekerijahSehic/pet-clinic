package com.zekerijah.petclinic.bootstrap;

import com.zekerijah.petclinic.model.Owner;
import com.zekerijah.petclinic.model.Vet;
import com.zekerijah.petclinic.services.OwnerService;
import com.zekerijah.petclinic.services.VetService;
import com.zekerijah.petclinic.services.map.OwnerServiceMap;
import com.zekerijah.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitiliazer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataInitiliazer(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    public DataInitiliazer() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
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

        System.out.println("Owners: ");

        Vet vet1 = new Vet();
        vet1.setFirstName("Billy");
        vet1.setLastName("Bens");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Park");

        vetService.save(vet2);

        System.out.println("Vets: ");

    }
}
