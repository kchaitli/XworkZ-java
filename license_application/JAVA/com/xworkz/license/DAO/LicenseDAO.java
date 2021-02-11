package com.xworkz.license.DAO;

import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dto.LicenseDTO;

public interface LicenseDAO {
	
	public void save(LicenseDTO dto);
	
	public LicenseDTO findByIdProofNo(String idProofNo);
	
	boolean updateVehicleTypeByIdProofNo(String idProofNo, VehicleType type);
	
	boolean deleteByIdProof(String idProof);
	
}
