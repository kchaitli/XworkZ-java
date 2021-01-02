package com.xworkz.hotel;

import java.util.Arrays;

import com.xworkz.hotel.constants.HotelLocation;

public class HotelInfo {
	private HotelDTO[] hotelArray = new HotelDTO[10];
	private int hotelCount = 0;

	public void addHotel(String hotelName, HotelLocation location, String ownerName, String hotelType,
			String servicesProvided, String[] foodItems) {
		HotelDTO hotelDto = new HotelDTO(hotelName, location, ownerName, hotelType, servicesProvided, foodItems);

		if (this.hotelCount < this.hotelArray.length) {
			this.hotelArray[hotelCount] = hotelDto;
			this.hotelCount++;

		} else {
			System.out.println("hotels are full");
		}
	}

	public void addHotel(HotelDTO hotel) {
		if (this.hotelCount < this.hotelArray.length && hotel != null) {
			System.out.println("hotel is available");
			if (hotel.getHotelName() != null && hotel.getLocation() != null && hotel.getFoodItems() != null
					&& hotel.getFoodItems().length >= 10) {
				System.out.println("hotel is added");
				this.hotelArray[hotelCount] = hotel;
				hotelCount++;
			} else {
				System.out.println("hotel information values are invalid");
			}
		} else {
			System.out.println("hotel not available");
		}
	}

	public void searchHotel(HotelLocation location, String hotelName) {
		System.out.println("--search method invoked--");
		for (int i = 0; i < hotelArray.length; i++) {
			if (hotelArray[i] != null) {
				if (hotelArray[i].getLocation().equals(location)
						&& hotelArray[i].getHotelName().equals(hotelName)) {
					System.out.println("hotel information matching given location and name is: ");
					System.out.println("hotel name is: " + hotelArray[i].getHotelName() + " " + "hotel location is: "
							+ hotelArray[i].getLocation() + " " + "owner name is: " + hotelArray[i].getOwnerName() + " "
							+ "hotel type is: " + hotelArray[i].getHotelType() + " " + "hotel service is: "
							+ hotelArray[i].getServicesProvided());
				System.out.println("food items are:");
				System.out.println(Arrays.toString(hotelArray[i].getFoodItems()));
				}else {
					System.out.println("hotel matching the location and name not found");
				}
			}
		}
	}
	public void displayHotel() {
		for(int i=0;i<hotelCount;i++) {
			System.out.println("--display method invoked--");
			if(hotelArray[i]!=null) {
				System.out.println("the following is hotel info");
				System.out.println("hotel name is: " + hotelArray[i].getHotelName() + " " + "hotel location is: "
						+ hotelArray[i].getLocation() + " " + "owner name is: " + hotelArray[i].getOwnerName() + " "
						+ "hotel type is: " + hotelArray[i].getHotelType() + " " + "hotel service is: "
						+ hotelArray[i].getServicesProvided() + " " + "food items are: "
						+ hotelArray[i].getFoodItems());
			}
		}
	}

}
