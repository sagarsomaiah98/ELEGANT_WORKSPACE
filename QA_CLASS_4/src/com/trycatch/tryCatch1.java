package com.trycatch;

public class tryCatch1 {

	public static void main(String[] args) {
		int a=20;
		int b=0;
		
		try
		{
			
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("cannot divide by 0");
			
		}
		
		
	
		
		int d=a+b;
		
		System.out.println(d);
		System.out.println("end of the progam");

	}
}
