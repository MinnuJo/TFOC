package StepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.google.common.collect.Table.Cell;

import ApplicationPages.Home;
import PageObjects.LoginPage;
import PageObjects.MyFleet;
import PageObjects.TFOC;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import resources.base;
import util.Constants;
import util.ExcelAction;

public class VesselSelection extends base {
	private String scenDesc;
	MyFleet fleet;
	TFOC tfoc;
	public WebDriver driver;

	public VesselSelection() {
		driver = Hooks.driver;
	}

	@Test
	@Given("user navigates to home page")
	public void user_navigates_to_home_page() {
		Home home = new Home(driver);
		home.goToHome();

	}

	@When("user select a vessel and navigate to TFOC")
	public void user_select_a_vessel_and_navigate_to_tfoc() throws InterruptedException {

		fleet = new MyFleet(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		fleet.getvesselid().click();
		fleet.getotherapps().click();
		Thread.sleep(2000);
		fleet.getTFOC().click();

	}

	@When("fill the voyage plan with data")
	public void fill_the_voyage_plan_with_data() throws IOException {

		tfoc = new TFOC(driver);
		tfoc.getvoyageplan().click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		tfoc.createvoyageplan().click();

		ExcelAction excelaction = new ExcelAction();
		String excelfilepath = Constants.path_TestData + Constants.file_TestData;

		excelaction.setExcelFile(excelfilepath, "VOYAGE FORM");

		for (int i = 0; i <= excelaction.getRowCountInSheet(); i++) {
			tfoc.getstartport().sendKeys(excelaction.getCellData(i, 0));
			tfoc.getendport().sendKeys(excelaction.getCellData(i, 1));

		}
	}

	@Then("A voyage to be generated")
	public void a_voyage_to_be_generated() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
