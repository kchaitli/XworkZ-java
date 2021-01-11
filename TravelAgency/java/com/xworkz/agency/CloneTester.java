package com.xworkz.agency;

import com.xworkz.agency.dto.PhoneBookDTO;

public class CloneTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		PhoneBookDTO bookDTO = new PhoneBookDTO();
		bookDTO.setName("Chaitli");
		bookDTO.setPincode("583102");
		bookDTO.setPhoneNo(8971884344l);
		
		PhoneBookDTO copyOfPhoneBook = bookDTO.clone();
		System.out.println(copyOfPhoneBook.getName()+" "+copyOfPhoneBook.getPhoneNo()+" "+copyOfPhoneBook.getPincode());
		Object object =(Object) bookDTO;
		
		//Object name = "x-workz";
		
		//PhoneBookDTO dto= (PhoneBookDTO) name;
	}

}
