package com.medical.model;

/**
 * Created by bahram on 5/3/16.
 */
public class PlanTemplate extends SimpleEntity{
    private String description;
    private Doctor doctor;
    private Period period;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }
}
