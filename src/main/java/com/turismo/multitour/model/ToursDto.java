package com.turismo.multitour.model;

import org.springframework.data.annotation.Id;

public class ToursDto {

	@Id
	private String id;

	private String tourName;
	private String tourDetails;
	private double tourPrice;

	public ToursDto() {}

	public ToursDto(String tourName, String tourDetails, double tourPrice) {
		this.tourName = tourName;
		this.tourDetails = tourDetails;
		this.tourPrice = tourPrice;
	}

	@Override
	public String toString() {
		return String.format("Tour[id=%s, tourName='%s', tourDetails='%s', tourPrice='%s']", 
				id, tourName, tourDetails, tourPrice);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTourName() {
		return tourName;
	}

	public void setTourName(String tourName) {
		this.tourName = tourName;
	}

	public String getTourDetails() {
		return tourDetails;
	}

	public void setTourDetails(String tourDetails) {
		this.tourDetails = tourDetails;
	}

	public double getTourPrice() {
		return tourPrice;
	}

	public void setTourPrice(double tourPrice) {
		this.tourPrice = tourPrice;
	}
}
