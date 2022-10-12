import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_FirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\geckodriver.exe");
		WebDriver d= new FirefoxDriver();
		
		
	
	}

}
