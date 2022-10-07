package com.elegant.inheritanceExample;

public class P {
	String lname="Charles";
	char grade='A';
	
	public void factory() {
		System.out.println("Factory owned by parent");
		
	}

public void house() {
		
		System.out.println("House owned by parent");
	}

	public static void main(String[] args) {
		P p = new P();
		
		p.factory();
		p.house();
		
		System.out.println(p.lname);
		System.out.println(p.grade);

	}

}
