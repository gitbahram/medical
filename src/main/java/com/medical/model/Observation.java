package com.medical.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by bahram on 5/3/16.
 */
@Entity
@Table(name="OBSERVATION")
public class Observation extends BaseEntity {
    private Date takenDate;
    private Date submitDate;
    private ObservationType observationType;
    private Plan plan;
    private Patient patient;

    @Temporal(TemporalType.DATE)
    @Column(name = "TAKEN_DATE")
    public Date getTakenDate() {
        return takenDate;
    }

    public void setTakenDate(Date takenDate) {
        this.takenDate = takenDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "SUBMIT_DATE")
    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    @ManyToOne
    @JoinColumn(name = "OBSERVATION_TYPE_ID")
    public ObservationType getObservationType() {
        return observationType;
    }

    public void setObservationType(ObservationType observationType) {
        this.observationType = observationType;
    }

    @ManyToOne
    @JoinColumn(name = "PLAN_ID")
    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @ManyToOne
    @JoinColumn(name = "PATIENT_ID")
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
