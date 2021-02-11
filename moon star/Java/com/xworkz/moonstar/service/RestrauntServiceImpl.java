package com.xworkz.moonstar.service;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.moonstar.dto.MenuDTO;
import com.xworkz.moonstar.dto.MenuDTO.Type;

public class RestrauntServiceImpl implements RestrauntService {
	
	private List<MenuDTO> menus;
	
	public RestrauntServiceImpl() {
		this.menus = new LinkedList<MenuDTO>();
		MenuDTO menu1 = new MenuDTO("Brownie",300,Type.NONVEG);
		MenuDTO menu2 = new MenuDTO("sushi",400,Type.NONVEG);
		MenuDTO menu3 = new MenuDTO("chitranna",30,Type.VEG);
		MenuDTO menu4 = new MenuDTO("Obattu",15,Type.VEG);
		MenuDTO menu5 = new MenuDTO("Ghee Rice", 300, Type.VEG);
		
		this.menus.add(menu1);
		this.menus.add(menu2);
		this.menus.add(menu3);
		this.menus.add(menu4);
		this.menus.add(menu5);
		
	}

	@Override
	public void displayItemGreaterThan(double price) {
		for(MenuDTO menuDTO : menus) {
			if(menuDTO.getPrice()>=price) {
				System.out.println(menuDTO);
			}
		}
	}

	@Override
	public void displayByName(String name) {
		for(MenuDTO menuDTO : menus) {
			if(menuDTO.getItemName().equals(name)) {
				System.out.println(menuDTO);
			}
		}
	}

	@Override
	public void findAndDisplay(Finder finder) {
		for(MenuDTO menuDTO: menus) {
			if(finder.test(menuDTO)) {
				System.out.println(menuDTO);
			}
		}
	}

}
