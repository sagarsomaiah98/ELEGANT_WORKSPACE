package com.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		
	Xls_Reader xls = new Xls_Reader("S:\\ELEGANT_WORKSPACE\\QA_CLASS_13_DATA_PARAMETERIZATION\\src\\TESTDATA\\SAUCE_LOGIN.xlsx");
		
		int rowCount=xls.getRowCount("SAUCE");
		
		System.out.println(rowCount);
		
		
		//String value=xls.getCellData("GMAIL", "STATUS", 11);
		
		//System.out.println(value);
		
		
		for(int i=2;i<=rowCount;i++) {
	    String uname=xls.getCellData("SAUCE", "USERNAME", i);
	    String pwd=xls.getCellData("SAUCE", "PASSWORD", i);
	   
			System.out.println(uname+" | "+pwd);
			
			
			System.setProperty("webdriver.chrome.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\chromedriver.exe");
			WebDriver d= new ChromeDriver();
			d.manage().window().maximize();
			d.get("https://www.saucedemo.com");
			
			d.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		
			d.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);

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

	}


