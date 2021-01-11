package com.xworkz.palace;

import com.xworkz.palace.dto.PalaceDTO;
import com.xworkz.palace.dto.ZooDTO;

public class CloneTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		PalaceDTO palaceDto = new PalaceDTO();
		palaceDto.setKingName("Ashoka");
		palaceDto.setQueenName("Rani");
		palaceDto.setLocation("Delhi");
		
		PalaceDTO copyOfPalace=  palaceDto.clone();
		System.out.println("King name is: "+copyOfPalace.getKingName()+" "+"Location of palace is: "+copyOfPalace.getLocation()+" "+"Queen name is: "+copyOfPalace.getQueenName());
		System.out.println("***********************");
		ZooDTO zooDto = new ZooDTO(200, true);
		zooDto.setName("Banergatta");
		zooDto.setNoOfAnimals(2000);
		zooDto.setOpen(true);
		
		System.out.println("Zoo name: "+zooDto.getName()+" "+"number of animals are: "+zooDto.getNoOfAnimals()+" "+"Zoo is open: "+zooDto.isOpen()+" "+"entryfee is "+zooDto.getEntryFees()+" "+"the zoo is safari "+zooDto.isSafari());
		
		ZooDTO copyOfZoo= zooDto.clone();
		System.out.println("Zoo name: "+copyOfZoo.getName()+"||"+"number of animals in the zoo are: "+copyOfZoo.getNoOfAnimals()+"s||"+"zoo is open: "+copyOfZoo.isOpen());
		
		
	}

}
