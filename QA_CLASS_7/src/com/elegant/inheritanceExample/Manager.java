package com.elegant.inheritanceExample;

public class Manager extends A {
	
	public void office() {
		
		System.out.println("Manager owns a office");
	}

	public static void main(String[] args) {
	
		Manager m = new Manager();
		m.office();
		m.bike();
		m.house();
		System.out.println(m.Lastname);
		System.out.println(m.money);
		
		

	}

}
