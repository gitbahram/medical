package com.medical.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by bahram on 5/3/16.
 */
@Entity
@Table
public class Patient {
    private Person person;
}
