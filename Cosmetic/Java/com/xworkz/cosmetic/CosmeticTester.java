package com.xworkz.cosmetic;

import com.xworkz.cosmetic.constants.CosmeticShade;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAOImpl;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticTester {

	public static void main(String[] args) {

		CosmeticDTO cosmeticDTO = new CosmeticDTO();
		cosmeticDTO.setBrand("Maybelline");
		cosmeticDTO.setType(CosmeticType.FOUNDATION);
		cosmeticDTO.setPrice(700);
		cosmeticDTO.setQuantity(50);
		cosmeticDTO.setShades(CosmeticShade.MEDIUM);

		CosmeticDAOImpl daoImpl = new CosmeticDAOImpl();
		daoImpl.save(cosmeticDTO);

		CosmeticDTO cosmeticDTO2 = new CosmeticDTO("lakme", CosmeticShade.LIGHT, CosmeticType.PRIMER, 500, 50);
		daoImpl.save(cosmeticDTO2);

		CosmeticDTO cosmeticDTO3 = new CosmeticDTO("Maybelline", CosmeticShade.MEDIUM, CosmeticType.FOUNDATION, 700,
				50);
		daoImpl.save(cosmeticDTO3);

		daoImpl.updatePrizeAndquantityByBrand(600, 30, "lakme");
		daoImpl.updatePrizeByBrandAndType(800, "lakme", CosmeticType.PRIMER);
		daoImpl.updateTypeByBrand("lakme", CosmeticType.FOUNDATION);
		daoImpl.getAll();
		daoImpl.deleteByBrand("lakme");
		daoImpl.totalSize();
		daoImpl.deleteAll();

	}

}
