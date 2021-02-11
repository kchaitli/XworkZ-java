package com.xworkz.license.dto;

import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.IdProof;
import com.xworkz.license.constants.VehicleType;

public class LicenseDTO extends CommonDTO {
	
	private IdProof idProof;
	private VehicleType vehicleType;
	private String idProofNo;
	private Date startDate;
	private boolean disability;
	private boolean commercial;
	
	public LicenseDTO() {
		super();
	}
	
	

	public LicenseDTO(String name, int age, AddressDTO addressDTO, long mobileNo, BloodGroup bloodGroup,
			Gender gender) {
		super(name, age, addressDTO, mobileNo, bloodGroup, gender);
	}

	


	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			System.out.println("object is null");
			return false;
		}
		if(obj instanceof LicenseDTO) {
			LicenseDTO converted = (LicenseDTO)obj;
			
			if(this.idProofNo!=null && this.idProofNo.contentEquals(converted.getIdProofNo())) {
				return true;
			}
		}
		
		return false;
	}


	public IdProof getIdProof() {
		return idProof;
	}

	public void setIdProof(IdProof idProof) {
		this.idProof = idProof;
	}

	public String getIdProofNo() {
		return idProofNo;
	}

	public void setIdProofNo(String idProofNo) {
		this.idProofNo = idProofNo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public boolean isDisability() {
		return disability;
	}

	public void setDisability(boolean disability) {
		this.disability = disability;
	}

	public boolean isCommercial() {
		return commercial;
	}

	public void setCommercial(boolean commercial) {
		this.commercial = commercial;
	}



	public VehicleType getVehicleType() {
		return vehicleType;
	}



	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}



	@Override
	public String toString() {
		return "LicenseDTO [idProof=" + idProof + ", vehicleType=" + vehicleType + ", idProofNo=" + idProofNo
				+ ", startDate=" + startDate + ", disability=" + disability + ", commercial=" + commercial + "]";
	}

	
	
}
