package com.staticExamples;

public class Employee {
	
static	String name="John";// static variable
	int age=30; //non static variable
	
	//static method
	public static void info() {
		
		System.out.println("Employee information");
	}
	//non static method
	public void pension() {
		
		System.out.println("Employee pension");
	}
	

	public static void main(String[] args) {
		System.out.println(name);
		
		info();
		Employee e = new Employee();
		
		System.out.println(e.age);
		e.pension();

		
		
		
	}

}
