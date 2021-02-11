package com.xworkz.license;

import java.util.Date;

import com.xworkz.license.DAO.LicenseDAO;
import com.xworkz.license.DAO.LicenseDAOImpl;
import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.IdProof;
import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dto.AddressDTO;
import com.xworkz.license.dto.DateOfBirthDTO;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseTester {

	public static void main(String[] args) {
		
		AddressDTO addressDTO = new AddressDTO(24, "ThilakNagar", 583104, "KHB", "Bellary", "karnataka", "nilaya");
		System.out.println(addressDTO);
		
		DateOfBirthDTO dateOfBirthDTO = new DateOfBirthDTO(29, 03, 1998);
		System.out.println(dateOfBirthDTO);
		
		LicenseDTO licenseDTO = new LicenseDTO("chaitli", 22, addressDTO, 8976565644l, BloodGroup.B_POSITIVE, Gender.FEMALE);
		licenseDTO.setIdProof(IdProof.AADHARCARD);
		licenseDTO.setIdProofNo("6262 9898 8989");
		licenseDTO.setVehicleType(VehicleType.LMV);
		licenseDTO.setStartDate(new Date());
		licenseDTO.setDisability(false);
		licenseDTO.setCommercial(false);
		
		LicenseDAO licenseDAOImpl = new LicenseDAOImpl();
		licenseDAOImpl.save(licenseDTO);
		licenseDAOImpl.findByIdProofNo("6262 9898 8989");
		licenseDAOImpl.updateVehicleTypeByIdProofNo("6262 9898 8989", VehicleType.THREE_WHEELER);
		licenseDAOImpl.deleteByIdProof("6262 9898 8989");
	
	}

}
