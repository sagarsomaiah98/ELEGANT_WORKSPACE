import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Launch_Edge_Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\msedgedriver.exe");
		WebDriver d= new EdgeDriver();
		
		WebDriver d1= new SafariDriver();
		WebDriver d2= new InternetExplorerDriver();
	}

}
