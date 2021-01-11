package com.xworkz.rules;

import com.xworkz.rules.lockdown.LockDownImplementation;
import com.xworkz.rules.lockdown.CoronaLockDown;

public class RulesTester {

	public static void main(String[] args) {
		
		CoronaLockDown implimentation = new LockDownImplementation();
		
		implimentation.socialDistancing();
		implimentation.sanitizer();
		implimentation.wearMask();
	}

}
