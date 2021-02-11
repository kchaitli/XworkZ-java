package com.xworkz.license.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseDAOImpl implements LicenseDAO {
	
	private List<LicenseDTO> database;
	
	public LicenseDAOImpl() {
		this.database = new ArrayList<LicenseDTO>();
	}

	@Override
	public void save(LicenseDTO dto) {
		System.out.println("invoked save in license dao impl");
		System.out.println("dto to save "+dto);
		
		boolean saved = this.database.add(dto);
		if(saved)
			System.out.println("dto is saved");
		else
			System.out.println("dto is not saved");
	}

	@Override
	public LicenseDTO findByIdProofNo(String idProofNo) {
		System.out.println("invoked findByIdProofNo");
		System.out.println("idProofNo:" + idProofNo);
		for (LicenseDTO licenseDTO : this.database) {
			String idProofFromDTO = licenseDTO.getIdProofNo();
			if (idProofFromDTO.equals(idProofNo)) {
				System.out.println("license found");
				return licenseDTO;
			}
		}
		return null;
	}
	
	@Override
	public boolean updateVehicleTypeByIdProofNo(String idProofNo, VehicleType type) {
		System.out.println("invoked updateVehicleTypeByIdProofNo");
		System.out.println("idProofNo:" + idProofNo);
		System.out.println("type:" + type);
		LicenseDTO dtoFromDB = this.findByIdProofNo(idProofNo);
		if (dtoFromDB != null) {
			System.out.println("can update , license is found");
			dtoFromDB.setVehicleType(type);
			return true;
		} else {
			System.out.println("cannot update , license not found");
		}
		return false;

	}

	@Override
	public boolean deleteByIdProof(String idProofNo) {
		
		System.out.println("invoked delete by idProof");
		System.out.println("idProofNo "+idProofNo);
		
		//Iterator iterator = (Iterator) database.iterator();
		Iterator<LicenseDTO> iterator = database.iterator();
		while(iterator.hasNext()) {
			LicenseDTO dto = iterator.next();
			if(dto.getIdProofNo().equals(idProofNo)) {
				System.out.println("delete the element");
				iterator.remove();
				System.out.println("element deleted");
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
}
