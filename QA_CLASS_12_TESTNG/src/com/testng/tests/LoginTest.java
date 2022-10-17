package com.testng.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com");
		
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

		d.findElement(By.xpath("//input[@id='login-button']")).click();
		
		try {
		d.findElement(By.xpath("//span[@class='title']"));
		System.out.println("TEST CASE PASSED");
		}
		catch(Exception e) {
			System.out.println("TEST CASE FAILED");
			
		}
		d.quit();
		
	}

	

}
