package com.zekerijah.petclinic.services;

import com.zekerijah.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
