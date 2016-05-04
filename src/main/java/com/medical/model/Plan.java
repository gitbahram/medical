package com.medical.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by bahram on 5/3/16.
 */
@Entity
@Table
public class Plan {
    private Patient patient;
    private Person person;
    private PlanTemplate planTemplate;
    private Date startDate;
    private Date endDate;
    private PlanStatus planStatus;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public PlanTemplate getPlanTemplate() {
        return planTemplate;
    }

    public void setPlanTemplate(PlanTemplate planTemplate) {
        this.planTemplate = planTemplate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public PlanStatus getPlanStatus() {
        return planStatus;
    }

    public void setPlanStatus(PlanStatus planStatus) {
        this.planStatus = planStatus;
    }
}
