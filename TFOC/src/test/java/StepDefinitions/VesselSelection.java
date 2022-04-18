package StepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.MyFleet;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import resources.base;

@RunWith(Cucumber.class)
public class VesselSelection extends base {

	MyFleet fleet;

	@Test
	@When("I select vessel")
	public void i_select_vessel() {
		fleet = new MyFleet(driver);
		fleet.getvesselid().click();
		throw new io.cucumber.java.PendingException();
	}

	@Test
	@Then("^user should navigate to ship page$")
	public void user_should_navigate_to_ship_page() {
		Assert.assertTrue(fleet.getshipicon().isSelected());
	}

}
