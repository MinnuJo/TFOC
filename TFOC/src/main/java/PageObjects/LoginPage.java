package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;

public LoginPage(WebDriver driver)
{
	this.driver=driver;
	}

	By username = By.id("loginUserName");
	By password = By.id("loginPwd");
	By loginbutton = By.id("btnLogin");
	

	public WebElement getUsername() {
		return driver.findElement(username);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getLoginButton() {
		return driver.findElement(loginbutton);
	}
}
