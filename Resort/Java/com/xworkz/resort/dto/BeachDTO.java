package com.xworkz.resort.dto;

public class BeachDTO implements Comparable<BeachDTO> {
	
	private String name;
	private int noOfResorts;
	private int iceLands;
	
	public BeachDTO() {
		
	}
	
	
	
	public BeachDTO(String name, int noOfResorts, int iceLands) {
		super();
		this.name = name;
		this.noOfResorts = noOfResorts;
		this.iceLands = iceLands;
	}



	@Override
	public int compareTo(BeachDTO o) {
		System.out.println("invoked compare to by name");
		
		int tempCompare = this.name.compareTo(o.getName());
		System.out.println(tempCompare);
		return tempCompare;
	}

	public int compareToResort(BeachDTO o) {
		
		System.out.println("invoked compare to resort");
		if(this.noOfResorts==o.noOfResorts) {
			System.out.println("equal"+noOfResorts);
			return 0;
		}
		
		if(this.noOfResorts>o.noOfResorts) {
			System.out.println("greater"+noOfResorts);
			return 1;
		}
		
		if(this.noOfResorts<o.noOfResorts) {
			System.out.println("lesser"+noOfResorts);
			return -1;
		}
		
		return 0;
		
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getNoOfResorts() {
		return noOfResorts;
	}



	public void setNoOfResorts(int noOfResorts) {
		this.noOfResorts = noOfResorts;
	}



	public int getIceLands() {
		return iceLands;
	}



	public void setIceLands(int iceLands) {
		this.iceLands = iceLands;
	}



	@Override
	public String toString() {
		return "BeachDTO [name=" + name + ", noOfResorts=" + noOfResorts + ", iceLands=" + iceLands + "]";
	}
	
	

}
