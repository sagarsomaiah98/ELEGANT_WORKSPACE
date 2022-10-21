package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	@Given("^launch chrome browser$")
	public void ilaunch_chrome_browser()  {
	  System.out.println("launch");
	}

	@When("^I navigate to url$")
	public void i_navigate_to_url()  {
		 System.out.println("navigate");
	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password()  {
		 System.out.println("username and password");
	}

	@When("^I click login$")
	public void i_click_login()  {
		 System.out.println("login button");
	}

	@Then("^I am able to login$")
	public void i_am_able_to_login()  {
		 System.out.println("success");
	}

}
