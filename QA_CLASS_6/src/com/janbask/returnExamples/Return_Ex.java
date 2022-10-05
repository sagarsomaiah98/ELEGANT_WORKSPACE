package com.janbask.returnExamples;

public class Return_Ex {
	
	//global variable
	int age=40;
	
	public int  pension() {
		
		//local variable
		int value=1000;
		int interest=200;
		
		int total=value+interest;
		
		System.out.println("total amount is "+total);
		
		
		return total;

		
	}
	

	public static void main(String[] args) {
		
		Return_Ex r = new Return_Ex();
		int a= r.pension();
		
		System.out.println(a);
		
		
		  if(a>1000) System.out.println("Tax should deducted");
		  else
		  System.out.println("Tax should not be deducted");
		 
		

	}

}
