package com.testng.examples;

import org.testng.annotations.Test;

public class Priority_Ex {
	
	@Test(priority=-1)
	public void york() {
		
		System.out.println("york");
	}
	
	@Test(priority=-2)
	public void sub() {
		
		System.out.println("sub");
	}
	
	@Test(priority=-3)
	public void start() {
		
		System.out.println("start");
	}
	@Test(priority=-4)
	public void add() {
		
		System.out.println("add");
	}

	


}
