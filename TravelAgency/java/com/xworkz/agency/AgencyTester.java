package com.xworkz.agency;

import com.xworkz.agency.contract.RedbusContract;
import com.xworkz.agency.redbus.TravelAgency;
import com.xworkz.agency.vrl.RedbusContractImplementor;

public class AgencyTester {

	public static void main(String[] args) {
		RedbusContract contract = new RedbusContractImplementor();
		TravelAgency agency =  new TravelAgency(contract);
		agency.acceptBooking();
	}

}
