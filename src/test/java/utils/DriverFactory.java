package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	public static WebDriver INSTANCE = null;
	
	public static void initializeDriver() {
		String browser = "chrome";
		
		if(INSTANCE==null) {
			switch (browser.toLowerCase()) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
				INSTANCE = new ChromeDriver();
				INSTANCE.manage().window().maximize();
				break;
			default:
				throw new java.lang.Error("Browser informado não é suportado");
			}
		}
	}
	
	public static WebDriver getInstance() {
		return INSTANCE;
	}
	
	public static void quitDriver() {
		INSTANCE.quit();
		INSTANCE = null;
	}
}

