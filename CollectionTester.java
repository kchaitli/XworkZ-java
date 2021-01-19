package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTester {

	public static void main(String[] args) {
		String cadbury = "eclairs";
		String nestle = "kitkat";
		String campco = "milkybar";
		String parle = "kiss me";
		String amul = "Dark chocolate";

		Collection<String> chocolates = new ArrayList<String>();

		// Collection chocolates1= null;

		boolean added = false;
		added = chocolates.add(campco);
		System.out.println(added);
		added = chocolates.add(nestle);
		System.out.println(added);
		added = chocolates.add(cadbury);
		System.out.println(added);
		added = chocolates.add(amul);
		System.out.println(added);
		added = chocolates.add(parle);
		System.out.println(added);
//		added= chocolates.add(null);
//		System.out.println(added);

		int totalElements = chocolates.size();
		System.out.println("totalElements: " + totalElements);

		String hersheys = "hersheys kisses";
		boolean removed = chocolates.remove(null);
		System.out.println("removed: " + removed);
//		String ref = null;
//		if (ref != null) {
//			System.out.println(ref.toString());
//		}
		added = chocolates.add(null);
		System.out.println("added null:" + added);
		added = chocolates.add(null);
		System.out.println("added null: " + added);
		totalElements = chocolates.size();
		System.out.println("totalElements: " + totalElements);

		chocolates.add(parle);
		totalElements = chocolates.size();
		System.out.println("total elements after adding duplicate: " + totalElements);

//		chocolates.remove(parle);
//		chocolates.remove(parle);
		totalElements = chocolates.size();
		System.out.println("totalElements: " + totalElements);

		System.out.println("*****looping chocolates*****");

		Object[] convertedChocolates = chocolates.toArray();
		for (int i = 0; i < convertedChocolates.length; i++) {
			System.out.println(convertedChocolates[i]);
		}
		
		System.out.println("***looping using iterator***");
		
		Iterator iterator = chocolates.iterator();

		while (iterator.hasNext()) {
			System.out.println("element present");
			Object str = iterator.next();
			System.out.println(str);

		}

		System.out.println("*******removing duplicate elements*******");

		ArrayList<String> chocolates1 = new ArrayList<String>();

		for (int i = 0; i < chocolates.size(); i++) {
			if (!chocolates1.contains(((ArrayList<String>) chocolates).get(i))) {
				chocolates1.add(((ArrayList<String>) chocolates).get(i));

			}
		}
		totalElements = chocolates1.size();
		System.out.println("totalElements: " + totalElements);
	}

}
// Iterator iterator = chocolates.iterator();
//		int i=0;
//		while (i<chocolates.size()) {
//			
//			System.out.println("inside while");
//			if((chocolates).contains(parle)) {
//				System.out.println("****inside if****");
//				chocolates.remove(parle);
//				totalElements = chocolates.size();
//				System.out.println("totalElements: " + totalElements);
//				break;
//			}else {
//				i++;
//			}
//			
//		}

//
//	  Iterator iterator1 = chocolates.iterator();
//
//		while (iterator1.hasNext()) {
//			System.out.println("element present");
//			Object str = iterator1.next();
//			System.out.println(str);
//			
//	}
//	}

//		for(Object element : chocolates) {
//			if(element.equals(parle)) {
//				System.out.println("****inside if****");
//				chocolates.add(parle);
//				totalElements = chocolates.size();
//				System.out.println("totalElements: " + totalElements);
//			}
//		}
//		System.out.println("*****looping ending iterator****");
