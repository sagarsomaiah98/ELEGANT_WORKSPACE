package com.elegant.methodOverloading;

public class Calc {
	
	//method with no arguments
	public void method1() {
		
		System.out.println("calling method 1");
	}
	
	
	public void method1(int a) {
		
		System.out.println("calling method with one argument "+a);
	}
	
public void method1(String name) {
		
		System.out.println("calling method with one argument "+name);
	}

	public static void main(String[] args) {
		
		Calc c = new Calc();
		c.method1("john");
	}

}
