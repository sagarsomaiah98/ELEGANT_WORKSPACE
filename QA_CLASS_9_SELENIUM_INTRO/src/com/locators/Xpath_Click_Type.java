package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Click_Type {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
		d.quit();
		
	}

}
