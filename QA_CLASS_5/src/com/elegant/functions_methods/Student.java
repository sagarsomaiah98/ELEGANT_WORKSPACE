package com.elegant.functions_methods;

public class Student {

	int age=15;
	String name="Henry";
	double height =4.5;
	char grade='B';
	
	public void marks() {
		int mark=95;
		System.out.println("student has scored mark of "+mark);
		
	}
	
	
	public static void main(String[] args) {
		
		Student stu= new Student();
		
		
		
		System.out.println(stu.grade);
		
	
		
		System.out.println(stu.age);
		System.out.println(stu.name);
		System.out.println(stu.height);
		stu.marks();
		
		

	}

}
