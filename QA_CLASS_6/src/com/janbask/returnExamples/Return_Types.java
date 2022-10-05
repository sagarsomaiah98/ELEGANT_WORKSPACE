package com.janbask.returnExamples;

public class Return_Types {
	
	
	
	
	public  int print_age( int age) {
		
		
		//System.out.println(" my name is - "+name);
		
		//return name;
		
		age=age+10;// 
		
		
		
		
		
		return age;
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		Return_Types r = new Return_Types();
		
		int value=r.print_age(50);
		
		System.out.println(value);
		
		
		

	}

}
