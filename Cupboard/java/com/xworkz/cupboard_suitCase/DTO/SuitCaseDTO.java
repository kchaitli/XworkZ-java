package com.xworkz.cupboard_suitCase.DTO;

public class SuitCaseDTO implements Storage,Cloneable {
	private String brand;
	private float capacity;
	private int noOfWheels;
	private boolean combinationLock;
	@Override
	public void purpose() {
		System.out.println("storage for travelling");
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getCapacity() {
		return capacity;
	}
	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public boolean isCombinationLock() {
		return combinationLock;
	}
	public void setCombinationLock(boolean combinationLock) {
		this.combinationLock = combinationLock;
	}
	@Override
	public String toString() {
		return "SuitCaseDTO [brand=" + brand + ", capacity=" + capacity + ", noOfWheels=" + noOfWheels
				+ ", combinationLock=" + combinationLock + "]";
	}
	@Override
	public int hashCode() {
		return 21;
	}
	@Override
	public SuitCaseDTO clone() throws CloneNotSupportedException {
		System.out.println("invoked clone in suit case dto");
		return (SuitCaseDTO)super.clone();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(this==obj) {
				return true;
			}
			if(obj instanceof SuitCaseDTO) {
				SuitCaseDTO dto = (SuitCaseDTO)obj;
				if(dto.getBrand()==this.brand) {
					return true;
				}
			}else {
				return false;
			}
		}
		return false;
	}
	
	
}
