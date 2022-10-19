package com.sauce.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.pages.AddTocartPage;
import com.sauce.pages.LoginPage;
import com.sauce.testbase.TestBase;
import com.sauce.util.TestUtil;

public class AddToCartTest extends TestBase {
	@BeforeMethod
	public void intial() throws IOException {
		intialization();
		
	}
	
	@Test
	public void addtocart() throws InterruptedException, IOException 
	{
		
		LoginPage l= new LoginPage();
		l.login("standard_user", "secret_sauce");
		
		AddTocartPage a = new AddTocartPage();
		a.addtocart();
		TestUtil.Screenshot();
		Thread.sleep(2000);
		
	}
	@AfterMethod
	public void teardown() 
	{
	driver.quit();	
		
	}

}
