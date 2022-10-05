package com.staticExamples;

public class StaticTest {
	
	//global static  variables
	static int marks=99;
	
	static String emp="John";
	
	//static Method declaration
	
	public static void display() {
		
		
		System.out.println("Printing display method");
	}

	
	
	public static void main(String args[]) {
		
		System.out.println(marks);
		System.out.println(emp);
		display();
		
		
	}
}
