package com.medical.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by bahram on 5/6/16.
 */
@MappedSuperclass
public class BaseEntity {

    private  Long id;
    @Id
    @Column(name="id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
