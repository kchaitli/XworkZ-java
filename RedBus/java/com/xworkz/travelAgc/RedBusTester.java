package com.xworkz.travelAgc;

import com.xworkz.travelAgc.impl.RedBusContractImpl;

public class RedBusTester {
	public static void main(String[] args) {
	RedBusContractImpl contract = new RedBusContractImpl();
	contract.maxBooking();//11 methods
	Contract ct = new RedBusContractImpl();
	ct.maxBooking();//10 methods
	Object obj = new RedBusContractImpl();
	//obj. 9 methods
	Security security = new RedBusContractImpl();
	security.open();//10 methods
	}
}
