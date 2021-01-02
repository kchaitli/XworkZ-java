package com.xworkz.flight;

import com.xworkz.flight.constants.Company;

public class FlightBooking {
	private FlightDTO[] flightArray = new FlightDTO[10];
	private int flightCount = 0;

	public void addFlight(String airoplaneCode, Company company, String startingPoint, String destination,
			int totalSeats, boolean domestic, double businessClassPrice, double economyClassPrice) {

		FlightDTO flightDto = new FlightDTO(airoplaneCode, company, startingPoint, destination, totalSeats, domestic, businessClassPrice, economyClassPrice);

		if (this.flightCount < this.flightArray.length) {
			this.flightArray[flightCount] = flightDto;
			this.flightCount++;

		} else {
			System.out.println("flight are full");
		}
	}
	//compile time polimarphism
	public void addFlight(FlightDTO flight) {
		System.out.println("--invoked add method--");
		if (this.flightCount<this.flightArray.length && flight != null) {
			System.out.println("flight is available ");
			if (flight.getAiroplaneCode() != null && flight.getCompany() != null && flight.getBusinessClassPrice() != 0
					&& flight.getStartingPoint() != null && flight.getBusinessClassPrice() >= 1000) {
				System.out.println("flight can be booked");
				this.flightArray[flightCount] = flight;
				flightCount++;
			} else {
				System.out.println("invalid values given ");

			}
		} else {
			System.out.println("flights not avaiable");
		}

	}

	public void searchFlightByStartingPoint(String startingPoint) {
		System.out.println("--search method invoked--");
		for (int i = 0; i < flightArray.length; i++) {
			if (flightArray[i] != null) {
				if (flightArray[i].getStartingPoint().equals(startingPoint)) {
					System.out.println("starting point of flight is: " + flightArray[i].getStartingPoint() + " "
							+ "destination of the flight is: " + flightArray[i].getDestination() + " "
							+ "Business class price is: " + flightArray[i].getBusinessClassPrice() + " "
							+ "flight company name is: " + flightArray[i].getCompany() + " " + "airplane code is: "
							+ flightArray[i].getAiroplaneCode() + " " + "economy class price is: "
							+ flightArray[i].getEconomyClassPrice() + " " + "totlal seats are: "
							+ flightArray[i].getTotalSeats());
				} else {
					System.out.println("flight not avaliable at starting point");
				}
			}

		}
	}

	public void displayFlight() {
		System.out.println("--display method invoked--");
		for (int i = 0; i < flightCount; i++) {
			if (flightArray[i] != null) {
				System.out.println("airplaneCode is: " + flightArray[i].getAiroplaneCode() + " " + "company is: "
						+ flightArray[i].getCompany() + " " + "startingPoint is:  " + flightArray[i].getStartingPoint()
						+ " " + "destination is: " + flightArray[i].getDestination() + " " + "Total seats is: "
						+ flightArray[i].getTotalSeats() + " " + "business class price is: "
						+ flightArray[i].getBusinessClassPrice() + " " + "economy class price is: "
						+ flightArray[i].getEconomyClassPrice());

			}
		}
	}
}
