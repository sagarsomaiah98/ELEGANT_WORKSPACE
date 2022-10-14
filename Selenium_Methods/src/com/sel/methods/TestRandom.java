package com.sel.methods;

public class TestRandom {
	
	public static int random() 
	{
	int value=	(int) (Math.random()*10000);
	
	//System.out.println(value);
	
	return value;
		
	}

	public static void main(String[] args) {
	int a=	random();
	System.out.println(a);

	}

}
