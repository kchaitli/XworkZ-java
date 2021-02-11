package com.xworkz.moonstar;

import java.util.Collections;

import com.xworkz.moonstar.dto.MenuDTO;
import com.xworkz.moonstar.service.Finder;
import com.xworkz.moonstar.service.FinderImpl;
import com.xworkz.moonstar.service.RestrauntService;
import com.xworkz.moonstar.service.RestrauntServiceImpl;
import com.xworkz.moonstar.service.VegFinderImpl;

public class TesterSatya {

	public static void main(String[] args) {
		RestrauntService restrauntService = new RestrauntServiceImpl();

		// restrauntService.displayItemGreaterThan(200);

//		Finder finder = new FinderImpl();
//		finder = new VegFinderImpl(); // did not get it

		restrauntService.findAndDisplay(new Finder() {
//functional interface(single abstract method)
			@Override
			public boolean test(MenuDTO dto) {
				if (dto.getPrice() < 200) {
					return true;
				}
				return false;
			}

		});
		// lambda expression (ref)->
		// () is required of you have more than one param
		// more than one statement
		restrauntService.findAndDisplay(d -> d.getPrice() > 300);

		// Collections.sort(list);
	}

}
