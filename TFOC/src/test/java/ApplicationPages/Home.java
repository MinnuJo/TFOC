package ApplicationPages;

import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;
import resources.base;

public class Home extends base {
	public WebDriver driver;
	LoginPage lp;

	public Home(WebDriver driver) {
		this.driver = driver;
	}

	public void goToHome() {

		lp = new LoginPage(driver);

		driver.get("https://153-daily-shore-azuredevops-smartship-v1dot2.alphaorimarine.com/");

		lp.getUsername().sendKeys("admin");
		lp.getPassword().sendKeys("Alph@or1");
		lp.getLoginButton().click();

	}

}
