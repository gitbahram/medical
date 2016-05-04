package com.medical.model;

import javax.persistence.*;

/**
 * Created by bahram on 5/3/16.
 */
@Entity
@Table
public class Patient {
    private Person person;
@ManyToOne
@JoinColumn(name = "person_id")
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
