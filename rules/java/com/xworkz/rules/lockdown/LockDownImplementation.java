package com.xworkz.rules.lockdown;

public class LockDownImplementation implements CoronaLockDown{
	
	@Override
	public int socialDistancing() {
		System.out.println("invoked social distancing");
		return 6;
	}
	
	@Override
	public void wearMask() {
		System.out.println("wear mask");
	}
	
	@Override
	public String sanitizer() {
		System.out.println("sanitizer used is");
		return "dettol";
	}
}
