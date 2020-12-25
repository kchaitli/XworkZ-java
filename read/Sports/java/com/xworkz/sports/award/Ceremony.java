package com.xworkz.sports.award;

public class Ceremony {
	private String name;
	private String[] foods;
	
	public Ceremony() {
		System.out.println("created ceremony");
	}
	public void distributeAward(String personName, String award) {
		System.out.println("invoked distributeAward");
		System.out.println("arg 1 "+personName);
		System.out.println("arg 2"+award);
	}
	
	public void displayFood() {
		System.out.println("invoked displayFoods");
		System.out.println(this.foods);
		if(this.foods!=null) {
			for(int z=0; z<this.foods.length; z++) {
				String food = this.foods[z];
				System.out.println(food);
			}
		}
	}
	public void displayCeremonyNameAndFoods() {
		System.out.println(this.name);
		this.displayFood();
	}
	public void accessParentMembers() {
		int hCode=super.hashCode();
		System.out.println(hCode);
		String string=super.toString();
		System.out.println(string);
	}
	public Ceremony(String name) {
		this.name=name;
	}
	public void setFoods(String[] foods) {
		this.foods = foods;
	}
	
}
