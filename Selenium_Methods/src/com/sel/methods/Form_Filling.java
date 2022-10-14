package com.sel.methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_Filling {
	
	public static int random() 
	{
	int value=	(int) (Math.random()*10000);
	
	System.out.println(value);
	
	return value;
		
	}
	

	public static void main(String[] args) {
		String uname="John"+random();
		
		System.setProperty("webdriver.chrome.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("ade");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("21 baker street");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Newyork");
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("NSW");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("2134");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("0412365478");
		driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("526987");
		driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
		

	}

}
