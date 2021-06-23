package com.zekerijah.petclinic.services;

import com.zekerijah.petclinic.model.Pet;
import org.springframework.stereotype.Service;

@Service
public interface PetService extends CrudService<Pet, Long> {

}
