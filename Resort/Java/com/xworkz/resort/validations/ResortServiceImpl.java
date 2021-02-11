package com.xworkz.resort.validations;

import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dto.ResortDTO;

public class ResortServiceImpl implements ResortService {
	
	private ResortDAO resortDAO;
	
	public ResortServiceImpl(ResortDAO resortDAO) {
		System.out.println("created ResortServiceDAO");
		this.resortDAO=resortDAO;
	}
	
	@Override
	public boolean validateAndSave(ResortDTO dto) {
		
		boolean validData = false;
		if(dto!=null) {
			System.out.println("dto is not null can save fields");
			String location = dto.getLocation();
			if(location!=null && location.length()>=3 && location.length()<=15 && !location.isEmpty() 
					&& !location.contains(" ") && !location.contains("[^A-Za-z0-9]")) {
				System.out.println("location is valid");
				validData=true;
			}else {
				System.out.println("location not valid");
				validData=false;
			}
			if(validData) {
				String name = dto.getName();
				if(name!= null && name.length()>=3 && name.length()<=15 && !name.isEmpty() && !name.contains(" ")) {
					System.out.println("name is valid");
					validData=true;
				}else {
					System.out.println("name is not valid");
					validData=false;
				}
			}
			if(validData) {
				double pricePerHead = dto.getPricePerHead();
				if(pricePerHead>=999 && pricePerHead<=2500) {
					System.out.println("pricePerHead is valid");
					validData=true;
				}else {
					validData=false;
				}
			}
			if (validData) {
				float rating = dto.getRatings();
				if (rating >= 0 && rating <= 5) {
					System.out.println("rating is valid");
					validData = true;
				} else {
					System.out.println("rating is invalid");
					validData = false;
				}
			}
			if (validData) {
	            long phoneNumber = dto.getPhoneNo();
	            int count=0;
	            while(phoneNumber>0) {
	            	phoneNumber=phoneNumber/10;
	            	count++;
	            }
				if (count==10) {
					System.out.println("phone number is valid");
					validData = true;
				} else {
					System.out.println("phone number is invalid");
					validData = false;
				}
			}
			if (validData) {
				String managerName = dto.getManagerName();
				if (managerName != null && managerName.length() >= 3 && managerName.length() <= 12
						&& !managerName.isEmpty() && !managerName.contains(" ")) {
					System.out.println("manager name is valid");
					validData = true;
				} else {
					System.out.println("manager name is invalid");
					validData = false;
				}
			}
			if (validData) {
				int numberOfEmployee = dto.getNoOfEmployees();
				if (numberOfEmployee >= 5 && numberOfEmployee <= 25) {
					System.out.println("number of employee is valid");
					validData = true;
				} else {
					System.out.println("number of employee is invalid");
					validData = false;
				}
			} 
			
			if(validData) {
				System.out.println("All data is valid");
				this.resortDAO.save(dto);
				validData=true;
				}
		}else {
			System.out.println("dto is null can not save fields");
		}
		
		return false;
	}


	@Override
	public boolean validateAndUpdateLocationByName(String Location, String name) {
		System.out.println("invoked validatAndDeleteByNameAndLocation");
		if (name != null && name.length() >= 3 && name.length() <= 15 && !name.isEmpty() && !name.contains(" ")
				&& Location != null && Location.length() >= 3 && Location.length() <= 15 && !Location.isEmpty()
				&& !Location.contains(" ") && !Location.contains("[^A-Za-z0-9]")) {
			this.resortDAO.updateLocationByName(Location, name);
			return true;
		}else {
			System.out.println("name and location are not valid");
		}
		return false;
	}


	@Override
	public boolean validateAndUpdateLocationByNameAndRatings(String location, String name, float ratings) {
		System.out.println("invoked validateAndUpdateLocationByNameandRating");
		if (name != null && name.length() >= 3 && name.length() <= 15 && !name.isEmpty() && !name.contains(" ")
				&& location != null && location.length() >= 3 && location.length() <= 15 && !location.isEmpty()
				&& !location.contains(" ") && !location.contains("[^A-Za-z0-9]") && ratings >= 0 && ratings <= 5) {
			this.resortDAO.updateLocationByNameandRating(location, name, ratings);
			return true;
		}
		return false;
	}


	@Override
	public boolean validateAndDeleteByNameAndLocation(String name, String location) {
		
		System.out.println("invoked validatAndDeleteByNameAndLocation");
		if (name != null && name.length() >= 3 && name.length() <= 15 && !name.isEmpty() && !name.contains(" ")
				&& location != null && location.length() >= 3 && location.length() <= 15 && !location.isEmpty()
				&& !location.contains(" ") && !location.contains("[^A-Za-z0-9]")) {
                 this.resortDAO.deleteByNameAndLocation(name, location);
                 return true;
		}else {
			System.out.println("name and location are not valid");
		}
		
		return false;
		
	}


	@Override
	public boolean validateAndAddMultipleResorts(List<ResortDTO> dtos) {
		System.out.println("invoked validateAddMultipleResorts");
		boolean valid=false;
		if(dtos!=null && dtos.size()>0) {
			int size=dtos.size();
			int tempSize=0;
				boolean saved=resortDAO.addMultipleResorts(dtos);
				if(!saved) {
					System.out.println("dto not saved");
					valid=false;
				}else {
					System.out.println("dto saved");
					tempSize++;
				}
			if(tempSize==size) {
				valid=true;
			}
		}
		return false;
	}


	@Override
	public int validateTotalResortSize() {
		return this.resortDAO.totalResortSize();
	}

	

}
