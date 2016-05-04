package com.medical.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by bahram on 5/3/16.
 */
@Entity
@Table
public class Observation {
    private Date takenDate;
    private Date submitDate;
    private ObservationType observationType;
    private Plan plan;
    private Patient patient;
}
