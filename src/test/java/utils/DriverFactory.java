package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class DriverFactory {
	
	public static WebDriver INSTANCE = null;
	static String browser = "chrome";
	
	public static void initializeDriver() {
		
	
//		if(browser.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
//			INSTANCE = new ChromeDriver();
//			INSTANCE.manage().window().maximize();
//		}
//		else if(browser.equalsIgnoreCase("firefox")) {
//			
//			INSTANCE = new FirefoxDriver();
//			INSTANCE.manage().window().maximize();
//		}
		
		
		if(INSTANCE==null) {
			switch (browser.toLowerCase()) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
				INSTANCE = new ChromeDriver();
				INSTANCE.manage().window().maximize();
				break;
			case "firefox":
				
				INSTANCE = new FirefoxDriver();
				INSTANCE.manage().window().maximize();
				break;
			case "opera":
				System.setProperty("webdriver.opera.driver", "resources/drivers/operadriver.exe");
				INSTANCE = new OperaDriver();
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

