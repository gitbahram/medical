package com.medical.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by bahram on 5/3/16.
 */
@Entity
@Table(name = "OBSERV_HEART_RATE")
public class ObservHeartRate extends BaseEntity{
    private Long hearRate;
    @Column(name = "HEAR_RATE")
    public Long getHearRate() {
        return hearRate;
    }

    public void setHearRate(Long hearRate) {
        this.hearRate = hearRate;
    }
}
