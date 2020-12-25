package com.xworkz.sports;

import com.xworkz.sports.award.Ceremony;

public class CeremonyTester {

	public static void main(String[] args) {
		
		Ceremony ceremony= new Ceremony("Agadi Fest");
		
		String[] foodItems= {"Jamoon","Kaju Barfi","Pepper chicken","Fried Rice","Mysore Pak"};
		
		ceremony.setFoods(foodItems);
		//ref
		ceremony.distributeAward("chaitli", "state level basket-ball");
		
		//ceremony.displayFoods();
		ceremony.displayCeremonyNameAndFoods();
		
		int code=ceremony.hashCode();
		System.out.println(code);
	}

}
