package com.xworkz.resort.validations;

import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public interface ResortService {
	
	boolean validateAndSave(ResortDTO dto);
	
	boolean validateAndUpdateLocationByName(String Location, String name);
	
	boolean validateAndUpdateLocationByNameAndRatings(String location, String name, float ratings);
	
	boolean validateAndDeleteByNameAndLocation(String name, String location);
	
	boolean validateAndAddMultipleResorts(List<ResortDTO> dtos);
	
	int validateTotalResortSize();
	
}
