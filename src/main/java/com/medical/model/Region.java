package com.medical.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by A.amouzesh on 11/11/2015.
 * select region_id, region_name from regions
 */
@Entity
@Table(name = "regions")
public class Region implements Serializable{
    private Long id;
    private String regionName;

    @Id
    @Column(name="region_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "region_name")
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @Override
    public String toString() {
        return regionName;
    }
}
