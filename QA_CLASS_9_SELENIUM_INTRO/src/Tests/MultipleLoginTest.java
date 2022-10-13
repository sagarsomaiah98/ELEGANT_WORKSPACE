package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLoginTest {
	
	public void login(String uname, String pwd) throws InterruptedException 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com");
		
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
	
		d.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);

		d.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
		
		try {
		d.findElement(By.xpath("//span[@class='title']"));
		System.out.println(uname+" -> TEST CASE PASSED");
		}
		catch(Exception e) {
			System.out.println(uname+ "-> TEST CASE FAILED");
			
		}
		d.quit();
		
	}
		
	

	public static void main(String[] args) throws InterruptedException {
		MultipleLoginTest m = new MultipleLoginTest();
		m.login("standard_user","secret_sauce");
		m.login("locked_out_user","secret_sauce");
		m.login("problem_user","secret_sauce");
		m.login("performance_glitch_user","secret_sauce");

	}

}
