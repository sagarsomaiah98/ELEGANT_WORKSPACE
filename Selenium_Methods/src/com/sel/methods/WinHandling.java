package com.sel.methods;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		
		Set<String> win= driver.getWindowHandles();
		
		System.out.println(win.size());
		
		Iterator<String> it =win.iterator();
		String parent= it.next();
		String child=it.next();
		
		System.out.println(parent);
		System.out.println(child);
		
		driver.switchTo().window(child);
		

	   driver.findElement(By.xpath("//a[contains(text(),'Our Story')]")).click();
	   
	 //  driver.findElement(By.xpath("//div[@class='inner']//div//a[contains(text(),'Contact Us')]")).click();
	   //code to switch to third window- assignment
	   
	  // driver.findElement(By.xpath("//a[normalize-space()='Billing and Tech Support']")).click();
	   
	   Thread.sleep(2000);
	 //  driver.close(); // close active window, window thats switched by selenium
	   driver.quit();//close all the window which is opened by selenium

	}

}
