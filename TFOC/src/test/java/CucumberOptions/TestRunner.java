package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
			features = "D:\\Automation\\TFOC\\src\\test\\java\\features",
			glue="StepDefinitions",
			monochrome=true
                    )
	public class TestRunner extends AbstractTestNGCucumberTests
	{
	

}
