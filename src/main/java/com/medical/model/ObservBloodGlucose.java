package com.medical.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by bahram on 5/3/16.
 */
@Entity
@Table(name = "OBSERV_BLOOD_GLUCOSE")
public class ObservBloodGlucose extends BaseEntity{
    @Column(name = "BLOODGLUCOSE")
    private Long bloodGlucose;

    public Long getBloodGlucose() {
        return bloodGlucose;
    }

    public void setBloodGlucose(Long bloodGlucose) {
        this.bloodGlucose = bloodGlucose;
    }
}
