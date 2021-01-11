package com.xworkz.palace.dto;

public class ZooDTO implements Cloneable{
	String name;
	int noOfAnimals;
	boolean open;
	double entryFees;
	boolean safari;
	
	public ZooDTO(double entryFees, boolean safari) {
		this.entryFees=entryFees;
		this.safari=safari;
	}
	
	public double getEntryFees() {
		return entryFees;
	}
	public boolean isSafari() {
		return safari;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfAnimals() {
		return noOfAnimals;
	}
	public void setNoOfAnimals(int noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	@Override
	public String toString() {
		return "ZooDTO [name=" + name + ", noOfAnimals=" + noOfAnimals + ", open=" + open + ", entryFees=" + entryFees
				+ ", safari=" + safari + "]";
	}
	@Override
	public int hashCode() {
		return 21;
	}
	@Override
	public ZooDTO clone() throws CloneNotSupportedException {
		System.out.println("invoked clone");
		return (ZooDTO)super.clone();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(this==obj) {
				return true;
			}
			if(obj instanceof ZooDTO) {
				ZooDTO dto= (ZooDTO)obj;
				if(dto.getName()==this.name) {
					return true;
				}
			}else {
				return false;
			}
		}
		return false;
	}
	
	
	
	
	
}
