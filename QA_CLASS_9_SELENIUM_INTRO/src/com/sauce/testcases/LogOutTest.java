package com.sauce.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOutTest {
	
	public void logout() {
		System.setProperty("webdriver.chrome.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		//timeout
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com");
		
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

		d.findElement(By.xpath("//input[@id='login-button']")).click();
		d.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		
		d.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		d.quit();
		
	}

	public static void main(String[] args) throws InterruptedException {
	

	}

}
