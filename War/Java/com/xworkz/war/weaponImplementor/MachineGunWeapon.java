package com.xworkz.war.weaponImplementor;

import com.xworkz.war.weapon.GunWeapon;

public class MachineGunWeapon implements GunWeapon{

	private int noOfBullets;
	
	@Override
	public void trigger() {
		System.out.println("pointed to trigger function");
	}

	public int getNoOfBullets() {
		return noOfBullets;
	}

	public void setNoOfBullets(int noOfBullets) {
		this.noOfBullets = noOfBullets;
	}

	@Override
	public int hashCode() {
		return 23;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(this==obj) {
				return true;
			}else {
				if(obj instanceof MachineGunWeapon) {
					MachineGunWeapon machinegun = (MachineGunWeapon)obj;
					if(machinegun.getNoOfBullets()==this.noOfBullets)
						return true;
				}
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "MachineGunWeapon [noOfBullets="+noOfBullets+"]";
	}
	
	

}
