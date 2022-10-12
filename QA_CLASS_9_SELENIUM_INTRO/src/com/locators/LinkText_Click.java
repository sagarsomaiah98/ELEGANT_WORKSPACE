package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Click {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.navigate().to("https://login.salesforce.com/?locale=in");
		//d.findElement(By.xpath("//a[@id='privacy-link']")).click();
		
		d.findElement(By.linkText("Privacy")).click();

	}

}
