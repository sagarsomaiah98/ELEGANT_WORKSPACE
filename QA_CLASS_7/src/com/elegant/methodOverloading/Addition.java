package com.elegant.methodOverloading;

public class Addition {
	//same method name but different arguments/parameters
	
	public void add(int a, int b)
	{
	
		int c=a+b;
		
		System.out.println(a+b);
	}
	
	
	public void add(int m, int n,int k)
	{
int g=m+n+k;
		
		System.out.println("addition of three numbers is "+g);
		
		
	}
	
	public void add(int m, String a) {
		System.out.println(m+a);
		
	}
	public void add(String  o, int v) {
		System.out.println(o+v);
		
	}
	public static void main(String[] args) {
		Addition a = new Addition();
		a.add("james",600);
	
		
	}

}
