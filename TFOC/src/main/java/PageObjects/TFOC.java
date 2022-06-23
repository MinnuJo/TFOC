package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TFOC {

	public WebDriver driver;

	public TFOC(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[contains(text(),'Voyage Plans')]")
	WebElement voyageplan;

	
	public WebElement getvoyageplan()
	{
		return voyageplan;
	}
	
	@FindBy(xpath="//button[contains(text(),'New Voyage Plan')]")
	WebElement createvoyage;
	
	public WebElement createvoyageplan()
	{
		return createvoyage;
	}
	
	@FindBy(xpath="//body/app-root[1]/div[2]/app-voyage-tab[1]/div[1]/div[2]/app-voyage-create[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tr[1]/td[1]/div[1]/table[1]/tr[1]/td[2]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement startport;
	
	public WebElement getstartport()
	{
		return startport;
	}
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[2]/app-voyage-tab[1]/div[1]/div[2]/app-voyage-create[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tr[1]/td[2]/table[1]/tr[1]/td[2]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement endport;
	
	public WebElement getendport()
	{
		return endport;
	}
	
}
