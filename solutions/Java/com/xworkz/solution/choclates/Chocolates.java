package com.xworkz.solution.choclates;

import java.util.ArrayList;
import java.util.Collection;

public class Chocolates {
	
	String cadbury="diary-milk";
	String nestle="milkybar";
	String amul="dark-choclate";
	String parle="kiss me";
	String campco="cofee-toffy";
	
	public void chocolates() {
		Collection collection= new ArrayList<Integer>(5);
		collection.add(cadbury);
		collection.add(nestle);
		collection.add(amul);
		collection.add(parle);
		collection.add(campco);
		System.out.println("The chocolates are "+collection);
	}
}
