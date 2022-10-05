package com.staticExamples;

public class Static_Example {
    static int age=30; //static variable
	
	static String name="Paul"; //static variable
	
	 double height=6.3; // non static variable
	
	//static method declaration
	public static void display() {
		
		System.out.println("Calling static method");
		
		
		System.out.println(age);
        System.out.println(name);	
        
        
        //you cannot access non static variable inside static method
      //System.out.println(height);
		
		
		
		
	}
	
	public void nonstaticmethod() {
		
		//you can access non static and static variables inside non static method
		
		System.out.println(age);
		System.out.println(name);
		System.out.println(height);
		
		
	}
	

	public static void main(String[] args) {
		
		display();
		System.out.println(age);
		
		System.out.println(name);
		
		Static_Example s= new Static_Example();
		
		
		System.out.println(s.height);
		
		System.out.println("*************calling nonstatic method*****************");
	s.nonstaticmethod();
		
		
		
		
		/*
		 * Static_Example s= new Static_Example(); s.display();
		 * System.out.println("*********Global Variables*******");
		 * System.out.println(s.age); System.out.println(s.name);
		 * System.out.println(s.height);
		 */
	}

}
