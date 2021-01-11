package com.xworkz.war.weaponImplementor;

public class AK47 extends MachineGunWeapon{
	
	@Override
	public void trigger() {
		System.out.println("invoked trigger in ak47");
		super.trigger();
	}

}
