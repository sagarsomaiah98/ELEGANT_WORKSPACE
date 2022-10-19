package com.sauce.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.pages.LoginPage;
import com.sauce.testbase.TestBase;
import com.sauce.util.TestUtil;

public class LoginTest extends TestBase {
	
	@BeforeMethod
	public void intial() throws IOException {
		intialization();
		
	}
	
	@Test
	public void Validlogin() throws IOException 
	{
		
		LoginPage l= new LoginPage();
		l.login("standard_user", "secret_sauce");
		TestUtil.Screenshot();
		
		
		
		
	}
	
	@Test
	public void Invalidlogin() throws IOException 
	{
		
		LoginPage l= new LoginPage();
		l.login("username1", "pass1233");
		TestUtil.Screenshot();
		
		
	}
	
	@AfterMethod
	public void teardown() 
	{
	driver.quit();	
		
	}

}
