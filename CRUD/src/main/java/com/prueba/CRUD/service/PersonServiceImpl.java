package com.prueba.CRUD.service;

import com.prueba.CRUD.model.Person;
import com.prueba.CRUD.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person newPerson(Person person) {
        return this.personRepository.save(person);
    }

    @Override
    public Iterable<Person> getAll() {
        return this.personRepository.findAll();
    }

    @Override
    public Person modifyPerson(Person person) {
        Optional<Person> personFound = this.personRepository.findById(person.getNumDoc());
        if(personFound.get() != null) {
            personFound.get().setName(person.getName());
            personFound.get().setEmail(person.getEmail());
            personFound.get().setLastName(person.getLastName());

            return this.personRepository.save(personFound.get());
        }
        return null;
    }

    @Override
    public boolean deletePerson(Long idPerson) {
        this.personRepository.deleteById(idPerson);
        return true;
    }
}
