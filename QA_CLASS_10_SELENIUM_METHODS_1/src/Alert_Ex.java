import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Ex {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "S:\\ELEGANT_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		d.findElement(By.xpath("//input[@title='Sign in']")).click();
		Thread.sleep(2000);
		
		Alert al =d.switchTo().alert();
		String msg= al.getText();
		System.out.println(msg);
		
	//	al.accept();// click on ok
		al.dismiss();// dismiss or click on cancel

	}

}
