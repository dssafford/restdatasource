package com.doug.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;


@Entity
@Table(name = "home_location")
public class HomeLocation {
    private Integer id;

    @NotNull
    private Integer locationNumber;

    @NotNull
    private String locationName;

    @NotNull
    @Size(max = 250)
    private String comments;

    @NotNull
    private Boolean isActive;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public HomeLocation(){ }

    public HomeLocation(String locationName, Integer locationNumber, String comments,
                        Date date_added, Boolean isActive) {
        this.locationName = locationName;
        this.locationNumber = locationNumber;
        this.comments = comments;
        this.isActive = isActive;
    }

    public Integer getLocationNumber() {
        return locationNumber;
    }

    public void setLocationNumber(Integer locationNumber) {
        this.locationNumber = locationNumber;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }




}
