package com.elegant.inheritanceExample;

public class C extends P{
	
	public void car() {
		
		System.out.println("child owns a car");
	}

	public static void main(String[] args) {
		
		C c = new C();
		c.car();
		c.house();
		c.factory();
		System.out.println(c.lname);
		System.out.println(c.grade);
	

	}

}
