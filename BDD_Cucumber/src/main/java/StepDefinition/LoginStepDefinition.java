package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("Chrome browser is launched")
	public void chrome_browser_is_launched() {
		System.out.println("CHROME BROWSER LAUNCHED");
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	   
	}

	@When("I enter the url")
	public void i_enter_the_url() {
		System.out.println("NAVIGATE TO URL");
		driver.get("http://www.saucedemo.com");
	  
	}

	@When("I enter the username and password")
	public void i_enter_the_username_and_password() {
	   
		System.out.println("USERNAME AND PASSWORD ENTERED");
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		System.out.println("LOGIN BUTTON CLICKED");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	
	}

	@Then("I am logged in successfully")
	public void i_am_logged_in_successfully() {
		System.out.println("LOGGED IN SUCCESSFULLY");
	    


	}
}
