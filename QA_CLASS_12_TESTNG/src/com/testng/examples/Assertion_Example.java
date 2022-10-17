package com.testng.examples;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Assertion_Example {
	
	
	@Test
	public void verify() {
		
		String name="Mark";
		
	 //  assertEquals(name, "John");	
	   
	   assertEquals(name, "John","not matched");
		
		
		
		
	}

}
