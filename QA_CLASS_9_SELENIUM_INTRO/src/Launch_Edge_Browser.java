import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Edge_Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\msedgedriver.exe");
		WebDriver d= new EdgeDriver();
	}

}
