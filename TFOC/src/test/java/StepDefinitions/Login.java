package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import resources.base;

public class Login extends base {

public WebDriver driver;

public Login()
{
	driver=Hooks.driver;
	}
	

	LoginPage log;
	

	@Given("^User is on Smartship Landing page$")
	public void user_is_on_smartship_landing_page() {

	//	driver.get(prop.getProperty("shorelogin"));

	}

	
	@When("^I give (.+) in username field$")
	public void i_give_in_username_field(String username) {

		log = new LoginPage(driver);

		log.getUsername().sendKeys(username);

	}

	
	@And("^I give (.+) in password field$")
	public void i_give_in_password_field(String password) {

		log.getPassword().sendKeys(password);

	}

	
	@And("^I click on login button$")
	public void i_click_on_login_button() {

		log.getLoginButton().click();
	}

	
	@Then("^I want to login to the shore application$")
	public void i_want_to_login_to_the_shore_application() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions
				.urlToBe("https://153-daily-shore-azuredevops-smartship-v1dot2.alphaorimarine.com/fleet"));

		String actualurl = "https://153-daily-shore-azuredevops-smartship-v1dot2.alphaorimarine.com/fleet";
		String expectedurl = driver.getCurrentUrl();

		Assert.assertEquals(actualurl, expectedurl);

	}

}