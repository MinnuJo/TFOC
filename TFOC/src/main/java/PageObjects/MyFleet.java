package PageObjects;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyFleet {
	
	WebDriver driver;
	
	public MyFleet(WebDriver driver)
	{
		this.driver=driver;
	}

	By vesselid=By.xpath("//div[@id=\'vessel-card-1000006\']");
	By shipicon=By.cssSelector("div.menu-item-icon.ship");
	
	public WebElement getvesselid()
	{
		return driver.findElement(vesselid);
	}
	
	public WebElement getshipicon()
	{
		return driver.findElement(shipicon);
		
	}
}
