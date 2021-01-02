package com.xworkz.hotel;

import com.xworkz.hotel.constants.HotelLocation;

public class HotelDTO {
	private String hotelName;

	private HotelLocation location;
	private String ownerName;
	private String hotelType;
	private String servicesProvided;
	private String[] foodItems;

	public HotelDTO() {

	}

	public HotelDTO(String hotelName, HotelLocation location, String ownerName, String hotelType,
			String servicesProvided, String[] foodItems) {
		super();
		this.hotelName = hotelName;
		this.location = location;
		this.ownerName = ownerName;
		this.hotelType = hotelType;
		this.servicesProvided = servicesProvided;
		this.foodItems = foodItems;
	}

	public void setFoodItems(String[] foodItems) {
		this.foodItems = foodItems;
	}

	public String getHotelName() {
		return hotelName;
	}

	public HotelLocation getLocation() {
		return location;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getHotelType() {
		return hotelType;
	}

	public String getServicesProvided() {
		return servicesProvided;
	}

	public String[] getFoodItems() {
		return foodItems;
	}

}
