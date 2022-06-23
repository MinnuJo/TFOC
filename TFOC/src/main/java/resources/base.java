package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class base {

	public WebDriver driver;



	 protected Properties prop;
	FileInputStream fis = null;
	ChromeOptions options=new ChromeOptions();
	

	public  WebDriver initializedriver() {
		prop=new Properties();
		try {
			fis = new FileInputStream("D:\\Automation\\TFOC\\src\\main\\java\\resources\\data.properties");
			prop.load(fis);
		} catch (IOException e) {
			return null;

		}
		String browser = prop.getProperty("browser");
		System.out.print(browser);
		options.addArguments("--disable-notifications", "--window-size=1920,1200","--ignore-certificate-errors", "--incognito");
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Minnu\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver(options);

		}
		return driver;
	}
	
    public void closeDriver(Scenario scenario){
       // if(scenario.isFailed()){
        //   saveScreenshotsForScenario(scenario);
    //    }
        driver.close();
    }
	}
