package com.xworkz.cityWards;

import com.xworkz.cityWards.constants.WardName;

public class CityWardDTO {
	private int wardNum;
	private WardName wardName;
	private String corporatorName;
	private int population;
	private double wardArea;
	
	public CityWardDTO() {
		
	}
	public CityWardDTO(int wardNum, WardName wardName, String corporatorName, int population, double wardArea) {
		super();
		this.wardNum = wardNum;
		this.wardName = wardName;
		this.corporatorName = corporatorName;
		this.population = population;
		this.wardArea = wardArea;
	}



	public int getWardNum() {
		return wardNum;
	}
	
	public WardName getWardName() {
		return wardName;
	}

	public String getCorporatorName() {
		return corporatorName;
	}
	public int getPopulation() {
		return population;
	}
	public double getWardArea() {
		return wardArea;
	}
	
	
}
