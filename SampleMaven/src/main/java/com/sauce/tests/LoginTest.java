package com.sauce.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	
	@Test
	public void login() throws InterruptedException 
	
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		d.quit();
		
		
		
	}

}
