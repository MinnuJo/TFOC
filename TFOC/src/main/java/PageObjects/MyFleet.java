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

	By vesselid=By.xpath("//small[contains(text(),'IMO 1000006')]");
	By shipicon=By.cssSelector("div.menu-item-icon.ship");
	By TFOC=By.xpath("//div[contains(text(),'TFOC')]");
	By OtherApp=By.xpath("//header/nav[1]/ul[1]/li[9]/div[1]");
	
	public WebElement getvesselid()
	{
		return driver.findElement(vesselid);
	}
	
	public WebElement getTFOC() {
		return driver.findElement(TFOC);
	}


	public WebElement getshipicon()
	{
		return driver.findElement(shipicon);
		
	}
	public WebElement getotherapps()
	{
		return driver.findElement(OtherApp);
	}
}
