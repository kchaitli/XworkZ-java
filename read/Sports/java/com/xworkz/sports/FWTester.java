package com.xworkz.sports;

import com.xworkz.sports.constants.FootWearType;
import com.xworkz.sports.footware.ShoeFootWear;

public class FWTester {

	public static void main(String[] args) {
		ShoeFootWear shoeFootWare = new ShoeFootWear();
		shoeFootWare.setBrand("Adidas");
		shoeFootWare.setSize(7);
		shoeFootWare.setPrice(2000);
		shoeFootWare.setFootWearType(FootWearType.SPORTS);
		
		shoeFootWare.displayDetails();
	
		double dis = shoeFootWare.calculateDiscount();
		System.out.println(dis);
		
		
	}

}
