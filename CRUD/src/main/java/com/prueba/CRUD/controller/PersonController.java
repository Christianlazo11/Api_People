package com.prueba.CRUD.controller;

import com.prueba.CRUD.model.Person;
import com.prueba.CRUD.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("/new")
    public Person newPerson(@RequestBody Person person) {
        return personService.newPerson(person);
    }

    @GetMapping("/all")
    public Iterable<Person> getAll() {
        return personService.getAll();
    }

    @PostMapping("/update")
    public Person updatePerson(@RequestBody Person person) {
        return this.personService.modifyPerson(person);
    }

    @PostMapping(value = {"/{id}"})
    public boolean deletePerson(@PathVariable(value = "id") Long id) {
        return this.personService.deletePerson(id);
    }

}
