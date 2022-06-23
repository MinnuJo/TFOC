package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import resources.base;

public class Hooks extends base {

	static String scenDesc;
	public static WebDriver driver;

	@Before
	public void before(Scenario scenario) {
		scenDesc = scenario.getName();
		driver = initializedriver();
	driver.get(prop.getProperty("shorelogin"));
		
}
	
//	@After
//	public void after()
//	{
//		driver.close();
//	}

}
