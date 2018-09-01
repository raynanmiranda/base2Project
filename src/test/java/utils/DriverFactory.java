package utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class DriverFactory {

	public static WebDriver INSTANCE = null;
	public static String browser = Configuration.BROWSER;
	
	public static void initializeDriver() throws MalformedURLException {
		
		if(INSTANCE == null) {
				
			if(Configuration.REMOTE.equals("true")) {
				//TODO Codigo remote/ SeleniumGrid
				switch (browser.toLowerCase()) {
				case "chrome":
					ChromeOptions optionChrome = new ChromeOptions();
					optionChrome.setCapability("intl.accept_languages", "pt-br");
					optionChrome.setCapability("dom.popup_maximum", 0);
					INSTANCE = new RemoteWebDriver(new URL(Configuration.REMOTE_URL), optionChrome);
					break;
				case "firefox":
					FirefoxOptions optionFireFox = new FirefoxOptions();
					optionFireFox.addPreference("intl.accept_languages", "pt-br");
					optionFireFox.addPreference("dom.popup_maximum", 0);
					INSTANCE = new RemoteWebDriver(new URL(Configuration.REMOTE_URL), optionFireFox);
					break;
					
				default:
					throw new java.lang.Error("Browser informado não é suportado");
				

				}	
			}
//			else {
//			
//			switch (browser.toLowerCase()) {
//			case "chrome":
//				System.setProperty("webdriver.chrome.driver", Configuration.PATH_CHROME);
//				INSTANCE = new ChromeDriver();
//				INSTANCE.manage().window().maximize();
//				break;
//			case "firefox":
//				//System.setProperty("webdriver.gecko.driver", "E:\\browserDrivers\\geckodriver.exe");
//				INSTANCE = new FirefoxDriver();
//				INSTANCE.manage().window().maximize();
//				break;
//			default:
//				throw new java.lang.Error("Browser informado não é suportado");
//			}
//		   }
			
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
