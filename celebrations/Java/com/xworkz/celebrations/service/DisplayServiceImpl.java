package com.xworkz.celebrations.service;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.celebrations.functional.Display;

public class DisplayServiceImpl implements DisplayService {
	
	private List<String> names;
	
	public DisplayServiceImpl() {
		this.names= new ArrayList<String>();
		this.names.add("Elon Musk");
		this.names.add("Steve Jobs");
		this.names.add("Modi");
		this.names.add("Kalam");
		this.names.add("Harvey Specter");

	}

	@Override
	public void printString(Display display) {
		for (String string : names) {
			display.print(string, " Indian");
		}
	}

}
