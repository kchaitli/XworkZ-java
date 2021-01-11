package com.xworkz.cupboard_suitCase;

import com.xworkz.cupboard_suitCase.DTO.CupboardDTO;
import com.xworkz.cupboard_suitCase.DTO.SuitCaseDTO;

public class StorageCloneTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		SuitCaseDTO suitcaseDto = new SuitCaseDTO();
		suitcaseDto.setBrand("Sky bag");
		suitcaseDto.setCapacity(5.8f);
		suitcaseDto.setNoOfWheels(4);
		suitcaseDto.setCombinationLock(true);
		
		SuitCaseDTO copyOfsuitcase = suitcaseDto.clone();
		System.out.println(copyOfsuitcase.getBrand()+" "+copyOfsuitcase.getCapacity()+" "+copyOfsuitcase.getNoOfWheels()+" "+copyOfsuitcase.isCombinationLock());
		
		CupboardDTO cupboardDTO = new CupboardDTO();
		cupboardDTO.setBrand("godrej");
		cupboardDTO.setLocker(true);
		cupboardDTO.setNoOfPartitions(4);
		cupboardDTO.setPrice(15000);
		cupboardDTO.setSize(10);
		
		CupboardDTO copyOfCupboard= cupboardDTO.clone();
		System.out.println(copyOfCupboard.getBrand()+" "+copyOfCupboard.getNoOfPartitions()+" "+copyOfCupboard.getPrice()+" "+copyOfCupboard.getSize()+" "+copyOfCupboard.isLocker());
	}

}
