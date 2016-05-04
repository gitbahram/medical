package com.medical.model;

import javax.persistence.*;

/**
 * Created by bahram on 5/3/16.
 */
@Entity
@Table
public class PlanTemplate {
    private String description;
    private Doctor doctor;
    private Period period;

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    @ManyToOne
    @JoinColumn(name = "period_id")
    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }
}
