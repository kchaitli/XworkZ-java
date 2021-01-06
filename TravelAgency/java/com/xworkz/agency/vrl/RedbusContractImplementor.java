package com.xworkz.agency.vrl;

import com.xworkz.agency.contract.RedbusContract;

public class RedbusContractImplementor implements RedbusContract {
	@Override
	public int minBooking() {
		System.out.println("invoked minBooking");
		int minBooking =20;
		return minBooking;
	}
	
	@Override
	public boolean busWarranty() {
		System.out.println("invoked busWarranty");
		return true;
	}
}
