package com.xworkz.cityWards;

import com.xworkz.cityWards.constants.WardName;

public class CityWardInfo {
	private CityWardDTO[] wardArray = new CityWardDTO[10];
	private int wardCount = 0;

	public void addWard(int wardNum, WardName wardName, String corporatorName, int population, double wardArea) {

		CityWardDTO wardDto = new CityWardDTO(wardNum, wardName, corporatorName, population, wardArea);

		if (this.wardCount < this.wardArray.length) {
			this.wardArray[wardCount] = wardDto;
			this.wardCount++;

		} else {
			System.out.println("wards are full ");
		}
	}

	public void addWard(CityWardDTO ward) {
		if (this.wardCount < this.wardArray.length && ward != null) {
			System.out.println("ward can be added");
			if (ward.getWardName() != null && ward.getWardNum() != 0 && ward.getPopulation() != 0
					&& ward.getPopulation() >= 5000) {
				
				this.wardArray[wardCount] = ward;
				wardCount++;
				System.out.println("ward is added "+ward.getWardName());
			} else {
				System.out.println("ward information values are invalid and population should be more than 5000");
			}
		} else {
			System.out.println("ward not available");
		}
	}
/**
 * 
 * @param cityWardName
 * @param cityWardNum
 * search method is fetching information of wards based on city ward name and city ward number
 */
	public void searchWardByWardNameandWardNum(WardName cityWardName, int cityWardNum) {
		boolean condition=false;
		System.out.println("--search method invoked--");
		for (int i = 0; i < wardArray.length; i++) {
			if (wardArray[i] != null) {
				if (wardArray[i].getWardName().equals(cityWardName) && wardArray[i].getWardNum() == cityWardNum) {
					condition= true;
					System.out.println("ward information matching given number and name is: ");
					System.out.println("ward number is: " + wardArray[i].getWardNum() + " " + "ward name is: "
							+ wardArray[i].getWardName() + " " + "corporator name is: "
							+ wardArray[i].getCorporatorName() + " " + "population of ward is: "
							+ wardArray[i].getPopulation() + " " + "ward area is: " + wardArray[i].getWardArea()
							+ "sq km");
				} 
			}
			
		}if(condition!=true) {
			System.out.println("ward matching the number and name not found");
		}
	}
	/**
	 * display ward method is used to display the information of wards
	 */
	public void displayWard() {
		System.out.println("--display method invoked--");
		for(int i=0;i<wardCount;i++) {
			if(wardArray[i]!=null) {
				System.out.println("The following is the ward info");
				System.out.println("ward number is: " + wardArray[i].getWardNum() + " " + "ward name is: "
						+ wardArray[i].getWardName() + " " + "corporator name is: "
						+ wardArray[i].getCorporatorName() + " " + "population of ward is: "
						+ wardArray[i].getPopulation() + " " + "ward area is: " + wardArray[i].getWardArea()
						+ "sq km");
			}
		}
	}
}
