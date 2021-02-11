package com.xworkz.celebrations;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TesterSushmitha {

	public static void main(String[] args) {
		Set<String> favouritePlaces= new HashSet<String>();
		
		favouritePlaces.add("Amsterdam");
		favouritePlaces.add("Hampi");
		favouritePlaces.add(null);
		favouritePlaces.add(null);
		favouritePlaces.add("Paris");
		favouritePlaces.add("Santorini");
		favouritePlaces.add("Sydney");
		favouritePlaces.add("Strasburg");
		favouritePlaces.add("Sydney");
		favouritePlaces.add("Hampi");
		
		System.out.println(favouritePlaces.size());
		favouritePlaces.forEach(e->System.out.println(e));
		
		System.out.println("****************");
		favouritePlaces = new LinkedHashSet<String>();
		favouritePlaces.add("Mysore");
		favouritePlaces.add("Hampi");
		favouritePlaces.add("Badami");
		favouritePlaces.add("Bijapur");
		favouritePlaces.forEach(e->System.out.println(e));
	}

}
