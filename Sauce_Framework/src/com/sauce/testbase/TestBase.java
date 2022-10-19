package com.sauce.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	FileInputStream fis;
	Properties prop;
	public static WebDriver driver;
	
	public void intialization() throws IOException
	
	{
		 fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\CONFIG\\CONFIG.properties");
		
		prop= new Properties();
		prop.load(fis);
		
		String bname =prop.getProperty("BROWSER");
		String url=prop.getProperty("URL");
		int timeout=Integer.parseInt(prop.getProperty("TIMEOUT"));
		
		switch(bname) 
		{
		case "CHROME":
		System.setProperty("webdriver.chrome.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\chromedriver.exe");
		 driver= new ChromeDriver();
		 break;
		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\geckodriver.exe");
			 driver= new FirefoxDriver();
			 break;
		case "EDGE":
			System.setProperty("webdriver.edge.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\msedgedriver.exe");
			 driver= new EdgeDriver();
			 break;
		default:
			System.out.println("INVALID BROWSER");
		
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
		driver.get(url);
		
		
	}
	

}
