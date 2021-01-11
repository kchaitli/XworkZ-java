package com.xworkz.incomplete;

import com.xworkz.incomplete.government.RawMaterial;
import com.xworkz.incomplete.government.SteelRawMaterial;

public class RawMaterialTester {
	public static void main(String[] args) {
		RawMaterial rawMaterial = new SteelRawMaterial();
		SteelRawMaterial steel = (SteelRawMaterial)rawMaterial;
		rawMaterial.manufacture();
		rawMaterial.heating();
		steel.steelRawMaterial();
	
	}
}
