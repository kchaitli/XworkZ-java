package com.xworkz.cosmetic.dao;

import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public interface CosmeticDAO {

	public boolean save(CosmeticDTO dto);

	public CosmeticDTO findByBrand(String brand);

	public CosmeticDTO findByBrandAndType(String brand, CosmeticType type);

	public boolean updatePrizeAndquantityByBrand(int prize, float quantity, String brand);

	public boolean updatePrizeByBrandAndType(int price, String brand, CosmeticType type);

	boolean updateTypeByBrand(String brand, CosmeticType type);

	boolean deleteByBrand(String brand);

	void deleteAll();

	List<CosmeticDTO> getAll();

	int totalSize();
}
