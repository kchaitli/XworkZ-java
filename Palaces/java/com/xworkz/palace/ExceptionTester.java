package com.xworkz.palace;



public class ExceptionTester {

	public static void main(String[] args) throws Throwable {
		Object obj = new Object();
		System.out.println(obj.hashCode());
		ExceptionalEvent event = new ExceptionalEvent();
		event.frame1();
		event.frame2();
		event.frame3();
		event.frame4();
		event.frame5();
		event.createExceptionalEvent(false);
		
	}

}
