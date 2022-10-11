import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_FirefoxBrowser {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
	}

}
