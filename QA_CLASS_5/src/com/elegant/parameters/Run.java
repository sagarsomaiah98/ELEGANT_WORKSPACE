package com.elegant.parameters;

public class Run {

	public static void main(String[] args) {
		Calc c = new Calc();
		
		c.Addition(10, 20);
		c.Addition(55, 20);
		c.multiplication(8, 3);
		
		
		Student s = new Student();
		s.display();
	}

}
