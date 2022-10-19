package com.sauce.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sauce.testbase.TestBase;
import com.sauce.util.TestUtil;

public class LoginPage extends TestBase{
	
	WebElement uname=driver.findElement(By.xpath("//input[@id='user-name']"));
	WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
    WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
	
	
    public void login(String username, String password) throws IOException 
    {
    	uname.sendKeys(username);
    	pwd.sendKeys(password);
    	login.click();
    	
    	
    	
    }

}
