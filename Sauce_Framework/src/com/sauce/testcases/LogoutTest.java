package com.sauce.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.pages.LogOutPage;
import com.sauce.pages.LoginPage;
import com.sauce.testbase.TestBase;
import com.sauce.util.TestUtil;

public class LogoutTest extends TestBase {
	@BeforeMethod
	public void intial() throws IOException {
		intialization();
		
	}
	
	
	@Test
	public void logoout() throws InterruptedException, IOException {
		
		LoginPage l= new LoginPage();
		l.login("standard_user", "secret_sauce");
		
		LogOutPage lo= new LogOutPage();
		lo.logout();
		TestUtil.Screenshot();
		Thread.sleep(2000);
		
		
	}
	@AfterMethod
	public void teardown() 
	{
	driver.quit();	
		
	}

}
