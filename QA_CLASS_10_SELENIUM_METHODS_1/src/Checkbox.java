import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://login.salesforce.com/?locale=ini");
		
		d.findElement(By.xpath("//input[@id='rememberUn']")).click();
	}

}
