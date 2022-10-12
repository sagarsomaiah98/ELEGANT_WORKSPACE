import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		d.get("https://www.bing.com");
		Thread.sleep(2000);
		d.get("https://www.google.com");
		Thread.sleep(2000);
		d.get("https://www.saucedemo.com");
		

	}

}
