package com.testng.examples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Ex {
	
	@Test
	public void methodA() {
		
		System.out.println("CALLING METHOD A");
	}
	
	@BeforeTest
	public void start() {
		
		System.out.println("********  STARTED *********");
	}

	@AfterTest
  public void end() {
		
		System.out.println("********  END *********");
	}
	
	@Test
  public void methodB() {
		
		System.out.println("CALLING METHOD B");
		
	}
	
	@BeforeMethod
	public void intial() {
		
		System.out.println("CALLING INTIAL METHOD");
	}
	@Test
	  public void methodC() {
			
			System.out.println("CALLING METHOD C");
			
		}
	@AfterMethod
	public void teardown() {
		
		System.out.println("CALLING TEAR DOWN ");
	}
	
	

}
