package com.elegant.inheritanceExample;

public class B extends A {
	
	
	public void car() {
		
		System.out.println(" child owns a car");
	}

public void factory() {
		
		System.out.println(" child owns a factory");
	}

	public static void main(String[] args) {
		
	
		
		System.out.println("**********************************");
		
		
		B c= new B();
		c.car();
		c.factory();
		c.bike();
		c.house();
		System.out.println(c.money);
		System.out.println(c.Lastname);
		
		
		
		
	}

}
