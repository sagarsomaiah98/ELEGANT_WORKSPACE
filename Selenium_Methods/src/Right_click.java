

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
	
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement ele=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		Actions action= new Actions(driver);
		action.contextClick(ele).perform();
		Thread.sleep(3000);
		
		System.out.println("done");

	}

}
