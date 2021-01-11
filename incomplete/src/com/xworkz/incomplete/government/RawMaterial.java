package com.xworkz.incomplete.government;

public abstract class RawMaterial {
	protected String typeOfMaterial="steel";
	
	public void heating() {
		System.out.println("heating of material to get shape");
		
	}
	public abstract void manufacture();
}
