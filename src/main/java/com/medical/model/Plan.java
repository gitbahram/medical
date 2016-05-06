package com.medical.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by bahram on 5/3/16.
 */
@Entity
@Table
public class Plan extends BaseEntity{
    private Patient patient;
    private Person person;
    private PlanTemplate planTemplate;
    private Date startDate;
    private Date endDate;
    private PlanStatus planStatus;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @ManyToOne
    @JoinColumn(name = "person_id")
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @ManyToOne
    @JoinColumn(name = "planTemplate_id")
    public PlanTemplate getPlanTemplate() {
        return planTemplate;
    }

    public void setPlanTemplate(PlanTemplate planTemplate) {
        this.planTemplate = planTemplate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "start_date")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    @Temporal(TemporalType.DATE)
    @Column(name = "end_date")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @ManyToOne
    @JoinColumn(name = "plan_status")
    public PlanStatus getPlanStatus() {
        return planStatus;
    }

    public void setPlanStatus(PlanStatus planStatus) {
        this.planStatus = planStatus;
    }
}
