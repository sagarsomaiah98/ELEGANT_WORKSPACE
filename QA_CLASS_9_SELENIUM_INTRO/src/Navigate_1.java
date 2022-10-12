import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		d.navigate().to("https://www.selenium.dev/");
		d.navigate().back();
		d.navigate().to("https://saucedemo.com");
		d.navigate().forward();
		d.navigate().to("https://orangehrm.com");
		d.navigate().refresh();

	}

}
