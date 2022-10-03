package com.elegant.variables;

public class Customer {
	//global variables
	
    double salary=432.89;
    int age= 28;
    
    boolean flag=true;
	
	public void order() 
	{
		//local variables
		String name="kevin";
	    double salary=100.25;
	    int age= 30;
	    char grade='M';
	    int pf=300;
		
		System.out.println(name+" "+age+" "+salary+" "+grade);
		System.out.println(flag);
		System.out.println(pf);
	}
	
	public void invoice() 
	{
		char grade='T';
		String name="Joe";
		System.out.println(name+" "+age+" "+salary+" "+grade);
		System.out.println(flag);
		//System.out.println(pf);
	}

	public static void main(String[] args) {
		
		Customer c = new Customer();
	c.invoice();
	
	System.out.println(c.flag);
	//System.out.println(c.pf);

	}

}
