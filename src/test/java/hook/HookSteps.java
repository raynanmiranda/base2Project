package hook;

import java.net.MalformedURLException;

import org.junit.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.Status;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverFactory;


public class HookSteps {

	public ExtentHtmlReporter htmlextent = null;
	public static ExtentReports report;
	public static ExtentTest log = null;
	
	@Before
	public void setUp() throws MalformedURLException {
		
		DriverFactory.initializeDriver();
		htmlextent = new ExtentHtmlReporter("/cucumber-Report/reportProject.html");
		report = new ExtentReports();
		report.attachReporter(htmlextent);
		
		
	}
	
	
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(1000);
		DriverFactory.quitDriver();
		
	}

	
}
