package com.elegant.functions_methods;

public class Bmw {
	//global/class variables
	
	String model="BX1";
	int manufacture=2020;
	
	public void transimission() {
		
		System.out.println("Car has auto transmission");
	}

	public void technology() {
		
		System.out.println("car has hybrid technology");
	}
	
	public void breaks() {
		
		System.out.println("car has ABS breaking");
	}
	
	public static void main(String args[]) {
		
		Bmw d=new Bmw();
		d.technology();
		d.transimission();
		d.breaks();
		System.out.println(d.model);
		System.out.println(d.manufacture);
		
		
		
		
	}
}
