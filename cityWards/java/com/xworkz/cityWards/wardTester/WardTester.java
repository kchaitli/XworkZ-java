package com.xworkz.cityWards.wardTester;

import com.xworkz.cityWards.CityWardDTO;
import com.xworkz.cityWards.CityWardInfo;
import com.xworkz.cityWards.constants.WardName;

public class WardTester {

	public static void main(String[] args) {
		CityWardInfo cityWardInfo = new CityWardInfo();
		
		CityWardDTO wardDTO = new CityWardDTO(5, WardName.RAJAJINAGAR, "surya", 6000, 20);
		CityWardDTO wardDTO2 = new CityWardDTO(6, WardName.VIDYARANYAPURA, "suresh", 8000, 30);
		cityWardInfo.addWard(wardDTO);
		cityWardInfo.addWard(wardDTO2);
		
		cityWardInfo.searchWardByWardNameandWardNum(WardName.YELAHANKA, 9);
		cityWardInfo.displayWard();
	}

}
