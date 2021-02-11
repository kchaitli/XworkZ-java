package com.xworkz.resort;

import java.util.ArrayList;
import java.util.List;

public class BoxingTester {

	public static void main(String[] args) {
		Integer age = 24;// auto boxing

		Double salary = new Double(450);
		double convertedSal = salary;// auto un boxing

		List<Integer> ageList = new ArrayList<Integer>();
		int veereshAge = 23;
		int rohanAge = 24;
		int sushmaAge = 23;
		ageList.add(veereshAge);// 23
		ageList.add(rohanAge);// 24
		ageList.add(sushmaAge);// 23
		List<Integer> copyOfAgeList = new ArrayList<Integer>();
		copyOfAgeList.addAll(ageList);
		copyOfAgeList.add(24);
		copyOfAgeList.add(23);
		copyOfAgeList.add(25);
		copyOfAgeList.add(22);

		System.out.println("copyOfAgeList " + copyOfAgeList.size());
		List<Integer> removeAgeList = new ArrayList<Integer>();
		removeAgeList.add(23);
		removeAgeList.add(22);
		removeAgeList.add(21);
		boolean constainall = copyOfAgeList.containsAll(removeAgeList);
		System.out.println("constainall " + constainall);
		copyOfAgeList.removeAll(removeAgeList);
		System.out.println("copyOfAgeList after removeall " + copyOfAgeList.size());

		
		System.out.println(copyOfAgeList.size());
	}

}
