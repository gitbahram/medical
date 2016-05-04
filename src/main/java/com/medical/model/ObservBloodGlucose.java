package com.medical.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by bahram on 5/3/16.
 */
@Entity
@Table(name = "observ_blood_glucose")
public class ObservBloodGlucose {
    @Column(name = "bloodglucose")
    private Long bloodGlucose;

    public Long getBloodGlucose() {
        return bloodGlucose;
    }

    public void setBloodGlucose(Long bloodGlucose) {
        this.bloodGlucose = bloodGlucose;
    }
}
