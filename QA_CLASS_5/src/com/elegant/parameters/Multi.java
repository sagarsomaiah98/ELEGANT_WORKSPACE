package com.elegant.parameters;

public class Multi {
	
	
	public void multiplication(int x,int y, int z) {
		int a=x*y*z;
		
		System.out.println("Multiplication of three numbers "+x+" and "+y+" and "+z+" is "+a);
		
		
		
	}

	public static void main(String[] args) {
		
		Multi b= new Multi();
		
		b.multiplication(41,56,78);
		
		
		
		

	}

}
