package com.xworkz.moonstar.service;

import com.xworkz.moonstar.dto.MenuDTO;
import com.xworkz.moonstar.dto.MenuDTO.Type;

public class VegFinderImpl implements Finder{

	@Override
	public boolean test(MenuDTO dto) {
		//System.out.println("invoked");
		if(dto!=null && dto.getType().equals(Type.VEG)) {
			//System.out.println("veg");
			return true;
		}
		return false;
	}

}
