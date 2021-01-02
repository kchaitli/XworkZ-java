package com.xworkz.flight;

import com.xworkz.flight.constants.Company;

public class FlightDTO {
	private String airoplaneCode;
	private Company company;
	private String startingPoint;
	private String destination;
	private int totalSeats;
	private boolean domestic;
	private double businessClassPrice;
	private double economyClassPrice;

	public FlightDTO() {

	}

	public FlightDTO(String airoplaneCode, Company company, String startingPoint, String destination, int totalSeats,
			boolean domestic, double businessClassPrice, double economyClassPrice) {
		super();
		this.airoplaneCode = airoplaneCode;
		this.company = company;
		this.startingPoint = startingPoint;
		this.destination = destination;
		this.totalSeats = totalSeats;
		this.domestic = domestic;
		this.businessClassPrice = businessClassPrice;
		this.economyClassPrice = economyClassPrice;
	}

	public String getAiroplaneCode() {
		return airoplaneCode;
	}

	public Company getCompany() {
		return company;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public String getDestination() {
		return destination;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public boolean isDomestic() {
		return domestic;
	}

	public double getBusinessClassPrice() {
		return businessClassPrice;
	}

	public double getEconomyClassPrice() {
		return economyClassPrice;
	}

}
