package com.xworkz.resort.dto;

public class ResortDTO {
	private String location;
	private String name;
	private double pricePerHead;
	private float ratings;
	private long phoneNo;
	private boolean offers;
	private String managerName;
	private int noOfEmployees;
	
	public ResortDTO() {
		
	}

	public ResortDTO(String location, String name, double pricePerHead, float ratings, long phoneNo, boolean offers,
			String managerName, int noOfEmployees) {
		super();
		this.location = location;
		this.name = name;
		this.pricePerHead = pricePerHead;
		this.ratings = ratings;
		this.phoneNo = phoneNo;
		this.offers = offers;
		this.managerName = managerName;
		this.noOfEmployees = noOfEmployees;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPricePerHead() {
		return pricePerHead;
	}

	public void setPricePerHead(double pricePerHead) {
		this.pricePerHead = pricePerHead;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public boolean isOffers() {
		return offers;
	}

	public void setOffers(boolean offers) {
		this.offers = offers;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	@Override
	public String toString() {
		return "ResortDTO [location=" + location + ", name=" + name + ", pricePerHead=" + pricePerHead + ", ratings="
				+ ratings + ", phoneNo=" + phoneNo + ", offers=" + offers + ", managerName=" + managerName
				+ ", noOfEmployees=" + noOfEmployees + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			System.out.println("object is null");
			return false;
		}
		if (obj instanceof ResortDTO) {
			ResortDTO converted = (ResortDTO) obj;
			if (this.name != null) {
				if (this.name.contentEquals(converted.getName())) {
					return true;
				}
			}
		}
		return false;
	}

}
