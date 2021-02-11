package com.xworkz.resort;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;

public class ResortTester {

	public static void main(String[] args) {
		
		List<ResortDTO> list = new LinkedList<ResortDTO>();
		
		ResortDAO dao = new ResortDAOImpl(list);
		
		ResortDTO dto = new ResortDTO("RajajiNagar", "sagar", 1500, 4.5f, 8971884344l, true, "Raj", 40);
		dao.save(dto);
		
		ResortDTO dto2 = new ResortDTO();
		dto2.setLocation("vidyanagar");
		dto2.setManagerName("somraj");
		dto2.setName("baga resort");
		dto2.setNoOfEmployees(200);
		dto2.setOffers(true);
		dto2.setPhoneNo(9812738738l);
		dto2.setPricePerHead(1800);
		dto2.setRatings(4.9f);
		dao.save(dto2);
		
		System.out.println(dao.totalResortSize());
		
		dao.updateLocationByName("goa", "sagar");
		dao.updateLocationByNameandRating("ooty", "baga resort", 4.9f);
		dao.deleteByNameAndLocation("sagar", "goa");
		dao.addMultipleResorts(list);
		
	}

}
