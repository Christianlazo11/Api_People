package com.prueba.CRUD.service;

import com.prueba.CRUD.model.Person;

public interface PersonService  {

    Person newPerson(Person person);
    Iterable<Person> getAll();
    Person modifyPerson(Person person);
    boolean deletePerson(Long idPerson);
}
