package com.apps.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "location")
public class Location implements Serializable {
    
    @Id
    @Column(name="location_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer locationId;
    
    @Column(name="city", nullable = true)
    private String city;
    
    
    public Location(){}

    
    

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
}
