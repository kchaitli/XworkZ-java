package com.xworkz.agency.redbus;

import java.io.Serializable;

import com.xworkz.agency.contract.RedbusContract;

public class TravelAgency implements Serializable{
	private RedbusContract contract;
	
	private String agencyName = new String(" chaitli travel agency");
	
	public TravelAgency(RedbusContract contract) {
		System.out.println("created Travel agency");
		this.contract= contract;
	}
	
	public void acceptBooking() {
		System.out.println("invoked acceptBooking");
		System.out.println("checking bookings for "+this.agencyName);
		boolean warranty = contract.busWarranty();
		
		if(warranty) {
			System.out.println("bus is under warranty");
			int min = contract.minBooking();
			if(min>0 && min<=20) {
				System.out.println("can accept booking");
			}else {
				System.out.println("cannot accept booking");
			}
		}else {
			System.out.println("bus is not under warranty");
		}
	}	
	@Override
	public TravelAgency clone() throws CloneNotSupportedException{
		return(TravelAgency) super.clone();
	}
	
	public String getAgencyName() {
		return agencyName;
	}
}
