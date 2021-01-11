package com.xworkz.palace;

public class ExceptionalEvent {
	public void createExceptionalEvent(boolean create) throws Throwable {
		System.out.println("invoked createExceptionalEvent");
		if(create) {
			System.out.println("creating exceptional event");
			Throwable throwable = new Throwable();
			throw throwable;
		}else {
			System.out.println("no exceptional event");
		}
		
	}
	public void frame1() throws Throwable {
		frame2();
	}
	public void frame2() throws Throwable {
		frame3();
	}
	public void frame3() throws Throwable {
		frame4();
	}
	public void frame4() throws Throwable {
		frame5();
	}
	
	public void frame5() throws Throwable {
		this.createExceptionalEvent(false);
	}
	

}
