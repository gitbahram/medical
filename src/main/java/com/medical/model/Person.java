package com.medical.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by bahram on 5/3/16.
 */
@Entity
@Table
public class Person {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private int gender;
    private String phone;
    private String address;
    private Long nationalId;
    private String fixedName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getNationalId() {
        return nationalId;
    }

    public void setNationalId(Long nationalId) {
        this.nationalId = nationalId;
    }

    public String getFixedName() {
        return fixedName;
    }

    public void setFixedName(String fixedName) {
        this.fixedName = fixedName;
    }
}
