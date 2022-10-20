package com.sauce.tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class AddEmployeeTest {
	
	@Test
	public void Addemployee() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		
		String fname="eve";
		String lname="lane";
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		d.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		d.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fname);
		d.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lname);
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	    String actual=d.findElement(By.xpath("//div[@class='orangehrm-edit-employee-name']/h6")).getText();	
	    System.out.println("Actual value --"+actual);
	    d.quit();
	
		
		assertEquals(actual, fname+" "+lname);
		
		
	}

}
