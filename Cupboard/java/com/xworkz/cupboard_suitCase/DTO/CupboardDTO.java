package com.xworkz.cupboard_suitCase.DTO;

public class CupboardDTO implements Storage,Cloneable{
	
	private int price;
	private String brand;
	private double size;
	private int noOfPartitions;
	private boolean locker;
	
	@Override
	public void purpose() {
		System.out.println("stagnent storage");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int getNoOfPartitions() {
		return noOfPartitions;
	}

	public void setNoOfPartitions(int noOfPartitions) {
		this.noOfPartitions = noOfPartitions;
	}

	public boolean isLocker() {
		return locker;
	}

	public void setLocker(boolean locker) {
		this.locker = locker;
	}

	@Override
	public String toString() {
		return "CupboardDTO [price=" + price + ", brand=" + brand + ", size=" + size + ", noOfPartitions="
				+ noOfPartitions + ", locker=" + locker + "]";
	}

	@Override
	public int hashCode() {
		return 23;
	}

	@Override
	public CupboardDTO clone() throws CloneNotSupportedException {
		System.out.println("clone invoked in cupboard dto");
		return (CupboardDTO)super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(this==obj) {
				return true;
			}if(obj instanceof CupboardDTO) {
				CupboardDTO dto = (CupboardDTO)obj;
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
