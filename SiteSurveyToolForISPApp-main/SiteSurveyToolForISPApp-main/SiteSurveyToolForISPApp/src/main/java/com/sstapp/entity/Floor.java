package com.sstapp.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "floor")

public class Floor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int floorId;

    private String floorName;

    private String floorPlanUrl;
    
   

    public String getFloorName() {
		return floorName;
	}


	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}


	public String getFloorPlanUrl() {
		return floorPlanUrl;
	}


	public void setFloorPlanUrl(String floorPlanUrl) {
		this.floorPlanUrl = floorPlanUrl;
	}


	public Property getProperty() {
		return property;
	}


	public void setProperty(Property property) {
		this.property = property;
	}


	@ManyToOne
    @JoinColumn(name = "property_id")
    private Property property;
}
