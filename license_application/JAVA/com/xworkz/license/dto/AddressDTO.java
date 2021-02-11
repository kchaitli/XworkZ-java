package com.xworkz.license.dto;

public class AddressDTO {

	private int doorNo;
	private String street;
	private int pincode;
	private String area;
	private String city;
	private String state;
	private String building;
	
	
	
	@Override
	public String toString() {
		return "AddressDTO [doorNo=" + doorNo + ", street=" + street + ", pincode=" + pincode + ", area=" + area
				+ ", city=" + city + ", state=" + state + ", building=" + building + "]";
	}

	public AddressDTO() {
		
	}

	public AddressDTO(int doorNo, String street, int pincode, String area, String city, String state, String building) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.pincode = pincode;
		this.area = area;
		this.city = city;
		this.state = state;
		this.building = building;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}
	
	
}
