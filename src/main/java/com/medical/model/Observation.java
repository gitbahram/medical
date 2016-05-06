package com.medical.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by bahram on 5/3/16.
 */
@Entity
@Table
public class Observation extends BaseEntity {
    private Date takenDate;
    private Date submitDate;
    private ObservationType observationType;
    private Plan plan;
    private Patient patient;

    @Temporal(TemporalType.DATE)
    @Column(name = "taken_date")
    public Date getTakenDate() {
        return takenDate;
    }

    public void setTakenDate(Date takenDate) {
        this.takenDate = takenDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "submit_date")
    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    @ManyToOne
    @JoinColumn(name = "observation_type_id")
    public ObservationType getObservationType() {
        return observationType;
    }

    public void setObservationType(ObservationType observationType) {
        this.observationType = observationType;
    }

    @ManyToOne
    @JoinColumn(name = "plan_id")
    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @ManyToOne
    @JoinColumn(name = "patient_id")
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
