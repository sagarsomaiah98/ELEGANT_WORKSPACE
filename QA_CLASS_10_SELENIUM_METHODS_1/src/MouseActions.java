import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		d.manage().window().maximize();
		
		d.get("https://www.globalsqa.com/demo-site/");
		
		 Actions a = new Actions(d);
		 
		 a.moveToElement(d.findElement(By.xpath("//a[@class='no_border'][normalize-space()='Free Ebooks']"))).build().perform();
		
		
	  d.findElement(By.xpath("//span[normalize-space()='Free Deep Learning eBooks']")).click();
	
	}

}
