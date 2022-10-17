package com.testng.examples;

import org.testng.annotations.Test;

public class SampleTestng {
	
	@Test
   public void method1() {
		
		System.out.println("calling method 1");
	}
	
	public void method2() {
		
		System.out.println("calling method 2");
	}
   @Test
	public void method3() {
		
		System.out.println("calling method 3");
	}

	

}
