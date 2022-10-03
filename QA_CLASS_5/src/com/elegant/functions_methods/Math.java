package com.elegant.functions_methods;

public class Math {	
	public void Addition()
	{
		int a=10;
		int b=80;
		int c=a+b;
		System.out.println("Addition of two numbers "+a+" and "+b+" is "+c);	
		
	}
	
	public void Subtraction()
	{
		int t=20;
		int l=7;
		int u=t-l;
		System.out.println("Subtraction of two numbers "+t+" and "+l+" is "+u);
		
	}
	public void multiplication() {
		
		int x=30;
		int y=10;
		int z=x*y;
		System.out.println("Multiplication of two numbers "+x+" and "+y +"  is "+z);
	}
	public static void main(String[] args) {
		//OBJECT
		
	//CLASSNAME OBJECTNAME= NEW CLASSNAME();
		Math m= new Math(); // creates objects
		
		m.multiplication();
	
		
		

	}

}
