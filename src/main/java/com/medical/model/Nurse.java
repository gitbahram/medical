package com.medical.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by bahram on 5/3/16.
 */
@Entity
@Table(name = "nurse")
public class Nurse {
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
