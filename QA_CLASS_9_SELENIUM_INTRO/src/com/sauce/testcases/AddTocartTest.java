package com.sauce.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddTocartTest {
	
	public void addtocart() {
		
		System.setProperty("webdriver.chrome.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com");
		
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

		d.findElement(By.xpath("//input[@id='login-button']")).click();
		
		d.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		d.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		d.quit();
		
	}

	public static void main(String[] args) {

		
		
		

	}

}
