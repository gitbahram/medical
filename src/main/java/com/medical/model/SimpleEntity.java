package com.medical.model;

import java.util.Date;

/**
 * Created by bahram on 5/3/16.
 */
public class SimpleEntity {
    private Long id;
    private Long creationId;
    private Date creationDate;
    private Long lastModifierId;
    private Date lastModifierDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreationId() {
        return creationId;
    }

    public void setCreationId(Long creationId) {
        this.creationId = creationId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getLastModifierId() {
        return lastModifierId;
    }

    public void setLastModifierId(Long lastModifierId) {
        this.lastModifierId = lastModifierId;
    }

    public Date getLastModifierDate() {
        return lastModifierDate;
    }

    public void setLastModifierDate(Date lastModifierDate) {
        this.lastModifierDate = lastModifierDate;
    }
}
