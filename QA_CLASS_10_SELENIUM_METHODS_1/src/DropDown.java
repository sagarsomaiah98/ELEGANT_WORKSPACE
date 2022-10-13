import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		Select s = new Select(d.findElement(By.xpath("//select[@id='first']")));
		Thread.sleep(2000);
		s.selectByValue("Yahoo");
		Thread.sleep(2000);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByVisibleText("Iphone");
		
		d.quit();
		
		
		
	}

}
