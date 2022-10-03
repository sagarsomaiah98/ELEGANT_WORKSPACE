package com.elegant.parameters;

public class Operations {
	
	public void Addition(int a, int b)//arguments/parameters
	{
		
		int c=a+b;
		System.out.println("Addition of two numbers "+a+" and "+b+" is "+c);	
		
	}
	

	public static void main(String[] args) {
	
		Operations o = new Operations();
		o.Addition(10,56);
		o.Addition(30,5);
		o.Addition(17,12);
		o.Addition(56,24);
	}

}
