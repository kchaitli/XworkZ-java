package com.xworkz.cupboard_suitCase.ExceptionEvent;

public class ExceptionEventStorage {
	public void createExceptionalEvent(boolean create) throws Throwable{
		System.out.println("invoked createExceptionalEvent");
		if(create) {
			System.out.println("creating exceptional event");
			Throwable throwable = new Throwable();
			throw throwable;
		}else {
			System.out.println("no exceptional event created");
		}
	}
	public void storageFull() throws Throwable {
		this.createExceptionalEvent(false);
	}
}
