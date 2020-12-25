package com.xworkz.sports.footware;

public class ShoeFootWear extends FootWear {
	public double calculateDiscount() {
		double price= super.getPrice();
		double discount=0;
		if(price>=1000) {
			discount=100;
		}
		if(price>=2000)
		{
			discount =200;
		}
		return discount;
	}
}
