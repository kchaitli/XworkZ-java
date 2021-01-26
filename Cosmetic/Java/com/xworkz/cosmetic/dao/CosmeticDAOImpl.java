package com.xworkz.cosmetic.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticDAOImpl implements CosmeticDAO {

	private List<CosmeticDTO> cosmetics;

	public CosmeticDAOImpl() {
		this.cosmetics = new ArrayList<CosmeticDTO>();
	}

	@Override
	public boolean save(CosmeticDTO dto) {

		System.out.println("------invoked save in cosmetic dto------");
		System.out.println("dto to save" + dto);

		boolean added = false;
		boolean contains = this.cosmetics.contains(dto);

		if (!contains) {
			added = this.cosmetics.add(dto);
		}
		if (added)
			System.out.println("cosmetic added");
		else
			System.out.println("cosmetic not added");

		return false;
	}

	@Override
	public CosmeticDTO findByBrand(String brand) {

		System.out.println("invoked find by brand");
		System.out.println("brand name: " + brand);
		for (CosmeticDTO cosmeticDTO : this.cosmetics) {
			String brandFromDTO = cosmeticDTO.getBrand();
			if (brandFromDTO.equals(brand)) {
				System.out.println("cosmetic by brand found");
				return cosmeticDTO;
			}
		}

		return null;
	}

	@Override
	public CosmeticDTO findByBrandAndType(String brand, CosmeticType type) {

		System.out.println("invoked find by brand and type");
		System.out.println("brand name: " + brand + " type: " + type);
		for (CosmeticDTO cosmeticDTO : this.cosmetics) {
			String brandFromDTO = cosmeticDTO.getBrand();
			CosmeticType typeFromDTO = cosmeticDTO.getType();
			if (brandFromDTO.equals(brand) && typeFromDTO.equals(type)) {
				System.out.println("cosmetic by brand found");
				return cosmeticDTO;
			}
		}

		return null;
	}

	@Override
	public boolean updatePrizeAndquantityByBrand(int price, float quantity, String brand) {
		System.out.println("---invoked updatePrizeAndQuantityByBrand---");
		System.out.println("brand " + brand + " price: " + price + " quantity: " + quantity);

		CosmeticDTO dtoFromDb = this.findByBrand(brand);
		if (dtoFromDb != null) {
			System.out.println("can update , cosmetic is found");
			dtoFromDb.setPrice(price);
			dtoFromDb.setQuantity(quantity);
			return true;
		} else {
			System.out.println("cannot update , cosmetic not found");
		}

		return false;
	}

	@Override
	public boolean updatePrizeByBrandAndType(int price, String brand, CosmeticType type) {

		System.out.println("---invoked updatePrizeByBrandAndType---");
		System.out.println("price " + price + " brand " + brand + " type " + type);

		CosmeticDTO dtoFromDb = this.findByBrandAndType(brand, type);
		if (dtoFromDb != null) {
			System.out.println("can update, cosmetic found");
			dtoFromDb.setPrice(price);
			System.out.println(cosmetics);
			return true;
		} else {
			System.out.println("cannot update, cosmetic not found");
		}

		return false;
	}

	@Override
	public boolean updateTypeByBrand(String brand, CosmeticType type) {

		System.out.println("---invoked updateTypeByBrand---");
		System.out.println("brand " + brand + "type: " + type);

		CosmeticDTO dtoFromDb = this.findByBrand(brand);
		if (dtoFromDb != null) {
			System.out.println("can update, cosmetic found");

			dtoFromDb.setType(type);
			System.out.println(cosmetics);
			return true;
		} else {
			System.out.println("cannot update, cosmetic not found");
		}

		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {

		System.out.println("------invoked delete methods-------");
		System.out.println("brand: " + brand);

		Iterator<CosmeticDTO> iterator = cosmetics.iterator();
		while (iterator.hasNext()) {
			CosmeticDTO dto = iterator.next();
			if (dto.getBrand().equals(brand)) {
				System.out.println("delete the element");
				iterator.remove();
				System.out.println("element deleted");
				System.out.println(cosmetics);
				return true;
			}
		}

		return false;
	}

	@Override
	public void deleteAll() {
		System.out.println("---invoked delete all method---");
		cosmetics.removeAll(cosmetics);
		System.out.println(cosmetics);
	}

	@Override
	public List<CosmeticDTO> getAll() {
		
		System.out.println("---invoked get all method---");
		
		for(int i=0;i<cosmetics.size();i++) {
			System.out.println(cosmetics.get(i));
		}
		
		return null;
	}

	@Override
	public int totalSize() {

		System.out.println("---invoked size---");

		System.out.println("the size is " + cosmetics.size());

		return 0;
	}

}
