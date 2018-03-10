package com.doug.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class City {

    @Id
    private Integer id;

    private String list_city;
    private BigDecimal list_growth_from_2000_to_2013;
    private BigDecimal list_latitude;
    private BigDecimal list_longitude;
    private Integer list_population;
    private Integer list_rank;
    private String list_state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return list_city;
    }

    public void setCity(String city) {
        this.list_city = city;
    }

    public BigDecimal getGrowth_from_2000_to_2013() {
        return list_growth_from_2000_to_2013;
    }

    public void setGrowth_from_2000_to_2013(BigDecimal growth_from_2000_to_2013) {
        this.list_growth_from_2000_to_2013 = growth_from_2000_to_2013;
    }

    public BigDecimal getLatitude() {
        return list_latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.list_latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return list_longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.list_longitude = longitude;
    }

    public Integer getPopulation() {
        return list_population;
    }

    public void setPopulation(Integer population) {
        this.list_population = population;
    }

    public Integer getRank() {
        return list_rank;
    }

    public void setRank(Integer rank) {
        this.list_rank = rank;
    }

    public String getState() {
        return list_state;
    }

    public void setState(String state) {
        this.list_state = state;
    }
}
