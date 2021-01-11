package com.xworkz.war.weaponImplementor;

import com.xworkz.war.weapon.BrahmosWeapon;

public class MissileBrahmosWeapon implements BrahmosWeapon{

	private int range;
	
	@Override
	public void damage() {
		System.out.println("invoked damage");
	}

	@Override
	public void abort() {
		System.out.println("invoked abort");
	}

	@Override
	public void dontKnow() {
		System.out.println("invoked dontKnow");
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

}
