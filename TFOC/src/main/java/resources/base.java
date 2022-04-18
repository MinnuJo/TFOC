package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public WebDriver driver;

	protected base() {
	}

	Properties prop = new Properties();
	FileInputStream fis = null;

	public WebDriver initializedriver() {
		try {
			fis = new FileInputStream("D:\\Automation\\TFOC\\src\\main\\java\\resources\\data.properties");
			prop.load(fis);
		} catch (IOException e) {
			return null;

		}
		String browser = prop.getProperty("browser");
		System.out.print(browser);
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Minnu\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		return driver;
	}

}
