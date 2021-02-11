package com.xworkz.resort;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;
import com.xworkz.resort.validations.ResortService;
import com.xworkz.resort.validations.ResortServiceImpl;

public class ResortServiceTester {
	
	public static void main(String[] args) {
		List<ResortDTO> list = new ArrayList<ResortDTO>();

		ResortDAO dao = new ResortDAOImpl(list);
		ResortService resortService = new ResortServiceImpl(dao);

		ResortDTO dto = new ResortDTO();
		dto.setPricePerHead(2000);
		dto.setNoOfEmployees(10);
		dto.setOffers(false);
		dto.setPhoneNo(7829731400l);
		dto.setLocation("bangalore");
		dto.setManagerName("raju");
		dto.setName("sampurna");
		dto.setRatings(4.5f);
		// dao.save(dto);

		resortService.validateAndSave(dto);

		ResortDTO dto2 = new ResortDTO();
		dto2.setPricePerHead(2000);
		dto2.setNoOfEmployees(10);
		dto2.setOffers(false);
		dto2.setPhoneNo(7829731400l);
		dto2.setLocation("mysore");
		dto2.setManagerName("sahil");
		dto2.setName("relax spa and resort");
		dto2.setRatings(4);

		resortService.validateAndSave(dto2);

		System.out.println(resortService.validateTotalResortSize());

		resortService.validateAndAddMultipleResorts(list);

		resortService.validateAndUpdateLocationByName("Coorg", "sampurna");

		resortService.validateAndUpdateLocationByNameAndRatings("Madikeri", "Sampurna", 4.5f);
		resortService.validateAndDeleteByNameAndLocation("relax spa and resort", "Mysore");

		System.out.println(resortService.validateTotalResortSize());

		System.out.println();
	}
}
