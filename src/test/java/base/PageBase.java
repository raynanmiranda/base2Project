package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DriverFactory;

public class PageBase {

	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public PageBase() {
		PageFactory.initElements(DriverFactory.getInstance(), this);
		this.driver = DriverFactory.getInstance();
		wait = new WebDriverWait(DriverFactory.getInstance(), 30);		
	}
	
	public void navegateTo(String url) {
		driver.navigate().to(url);
		
	}

	
}
