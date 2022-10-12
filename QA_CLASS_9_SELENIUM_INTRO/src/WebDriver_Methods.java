import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.opencart.com/");
		//GET TITLE
	String title=	d.getTitle();
	System.out.println(title);
		
		//GET PAGESOURCE
		
	String pagesource=d.getPageSource();
	System.out.println(pagesource);
		//MAXIMIZE
		d.manage().window().maximize();
		//MINIMIZE
	//	d.manage().window().minimize();
		
		//QUIT/CLOSE BROWSER
	//	d.close();
		d.quit();
		
		

	}

}
