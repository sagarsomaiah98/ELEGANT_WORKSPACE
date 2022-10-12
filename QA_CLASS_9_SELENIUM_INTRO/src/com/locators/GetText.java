package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com");
	
		d.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
		String msg=d.findElement(By.xpath("//h3[normalize-space()='Epic sadface: Username is required']")).getText();
		System.out.println(msg);
		d.quit();
		
	}

}
