package com.medical.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by bahram on 5/3/16.
 */
@Entity
@Table(name = "OBSERV_BLOOD_PRESSURE")
public class ObservBloodPressure extends BaseEntity {
    private Long systolic;
    private Long diastolic;
    @Column(name = "DIASTOLIC")
    public Long getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(Long diastolic) {
        this.diastolic = diastolic;
    }
    @Column(name = "SYSTOLIC")
    public Long getSystolic() {
        return systolic;
    }

    public void setSystolic(Long systolic) {
        this.systolic = systolic;
    }
}
