package com.prueba.CRUD.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Person {

    @Id
    @Column
    private Long numDoc;
    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    private String email;
}
