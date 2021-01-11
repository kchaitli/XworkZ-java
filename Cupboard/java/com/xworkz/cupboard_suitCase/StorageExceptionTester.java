package com.xworkz.cupboard_suitCase;

import com.xworkz.cupboard_suitCase.ExceptionEvent.ExceptionEventStorage;

public class StorageExceptionTester {

	public static void main(String[] args) throws Throwable {
		ExceptionEventStorage event = new ExceptionEventStorage();
		event.createExceptionalEvent(true);
	}

}
