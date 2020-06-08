package utils;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstanciarWebDriver {

	protected static WebDriver driver = null;
	
	public static WebDriver getDriver() {
		if (driver == null) {
			File file = new File(Constants.PATH_CHROMEDRIVER);
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		return driver;
	}

	public static WebDriver destroyInstanciarWebDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
		return driver;
	}

	public static void fecharNavegador() {
		if (driver != null) {
			driver.close();
		}
	}

}
