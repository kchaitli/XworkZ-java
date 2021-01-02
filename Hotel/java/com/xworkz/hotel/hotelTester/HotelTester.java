package com.xworkz.hotel.hotelTester;

import com.xworkz.hotel.HotelDTO;
import com.xworkz.hotel.HotelInfo;
import com.xworkz.hotel.constants.HotelLocation;

public class HotelTester {

	public static void main(String[] args) {
		HotelInfo hotelInfo = new HotelInfo();
		String food[]= {"butter biscuit","puff","toast","Idli","Dosa","puri","pulav","fried rice"," fruit juice","desert"};
		
		HotelDTO hotelDTO = new HotelDTO("sagar", HotelLocation.RAJAJINAGAR, "sagar", "restraunt", "foodServed", food);
		hotelInfo.addHotel(hotelDTO);
		hotelInfo.searchHotel(HotelLocation.MALLESHWARAM, "sagar");
		hotelInfo.displayHotel();
	}

}
