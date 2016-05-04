package com.medical.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by bahram on 5/3/16.
 */
@Entity
@Table
public class ObservBloodPressure {
    private Long systolic;
    private Long diastolic;
    @Column(name = "diastolic")
    public Long getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(Long diastolic) {
        this.diastolic = diastolic;
    }
    @Column(name = "systolic")
    public Long getSystolic() {
        return systolic;
    }

    public void setSystolic(Long systolic) {
        this.systolic = systolic;
    }
}
