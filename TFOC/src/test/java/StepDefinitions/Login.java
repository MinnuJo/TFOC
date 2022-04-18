package StepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.LoginPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import resources.base;

public class Login extends base {

	LoginPage log;

	@Given("^initialize driver$")
	public void initialize_driver() {
		WebDriver driver = initializedriver();

	}

	@Test
	@And("^User is on Smartship Landing page$")
	public void user_is_on_smartship_landing_page() {

		driver.get("https://153-daily-shore-azuredevops-smartship-v1dot2.alphaorimarine.com/");
	}

	@Test
	@When("^I give (.+) in username field$")
	public void i_give_in_username_field(String username)  {
		log = new LoginPage(driver);
		log.getUsername().sendKeys(username);
		
	}

	@Test
	@And("^I give (.+) in password field$")
	public void i_give_in_password_field(String password) {

		log.getPassword().sendKeys(password);

	}

	@Test
	@And("^I click on login button$")
	public void i_click_on_login_button() {

		log.getLoginButton().click();
	}

	@Test
	@Then("^I want to login to the shore application$")
	public void i_want_to_login_to_the_shore_application() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions
				.urlToBe("https://153-daily-shore-azuredevops-smartship-v1dot2.alphaorimarine.com/fleet"));

		String actualurl = "https://153-daily-shore-azuredevops-smartship-v1dot2.alphaorimarine.com/fleet";
		String expectedurl = driver.getCurrentUrl();

		Assert.assertEquals(actualurl, expectedurl);
		
		Thread.sleep(2000);
		driver.close();
	}

}