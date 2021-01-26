package com.xworkz.cosmetic.dto;

import com.xworkz.cosmetic.constants.CosmeticShade;
import com.xworkz.cosmetic.constants.CosmeticType;

public class CosmeticDTO {

	private String brand;
	private CosmeticShade shades;
	private CosmeticType type;
	private int price;
	private float quantity;

	public CosmeticDTO() {

	}

	@Override
	public String toString() {
		return "CosmeticDTO [brand=" + brand + ", shades=" + shades + ", type=" + type + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}

	public CosmeticDTO(String brand, CosmeticShade shades, CosmeticType type, int price, float quantity) {
		super();
		this.brand = brand;
		this.shades = shades;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			System.out.println("object is null");
			return false;
		}
		if (obj instanceof CosmeticDTO) {
			CosmeticDTO converted = (CosmeticDTO) obj;
			if (this.brand != null && this.type != null) {
				if (this.brand.contentEquals(converted.getBrand()) && this.type.equals(converted.getType())) {
					System.out.println("cosmetic is equal");
					return true;
				}
			}
		}
		return false;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public CosmeticShade getShades() {
		return shades;
	}

	public void setShades(CosmeticShade shades) {
		this.shades = shades;
	}

	public CosmeticType getType() {
		return type;
	}

	public void setType(CosmeticType type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

}
