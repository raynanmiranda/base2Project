package hook;

import java.net.MalformedURLException;

import org.apache.commons.io.FileUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverFactory;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.Scenario;

public class HookSteps {

	public ExtentHtmlReporter htmlextent = null;
	public static ExtentReports report;
	public static ExtentTest log = null;

	@Before
	public void setUp() throws MalformedURLException {

		DriverFactory.initializeDriver();

		// Initialize Reports
		htmlextent = new ExtentHtmlReporter("/cucumber-Report/reportProject.html");

		// report = new ExtentReports();
		// report.attachReporter(htmlextent);

	}

	@After(order = 1)
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			String screenshotName = "Erro_Scenario_"+scenario.getName().replaceAll(" ", "_");
			try {
				File sourcePath = ((TakesScreenshot) DriverFactory.getInstance()).getScreenshotAs(OutputType.FILE);
				String dest = System.getProperty("user.dir") + "./cucumber-Report/screenshots/" + screenshotName
						+ ".png";
				File destinationPath = new File(dest);
				FileUtils.copyFile(sourcePath, destinationPath);
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (IOException e) {
			}
		}

//		else if (scenario.getStatus().toLowerCase() == "Passed") {
//			String screenshotName = scenario.getName().replaceAll(" ", "_");
//			try {
//				File sourcePath = ((TakesScreenshot) DriverFactory.getInstance()).getScreenshotAs(OutputType.FILE);
//				String dest = System.getProperty("user.dir") + "./cucumber-Report/screenshots/" + screenshotName
//						+ ".png";
//				File destinationPath = new File(dest);
//				FileUtils.copyFile(sourcePath, destinationPath);
//				Reporter.addScreenCaptureFromPath(destinationPath.toString());
//			} catch (IOException e) {
//			}
//		} else if (scenario.getStatus().toLowerCase() == "Skipped") {
//			String screenshotName = scenario.getName().replaceAll(" ", "_");
//			try {
//				File sourcePath = ((TakesScreenshot) DriverFactory.getInstance()).getScreenshotAs(OutputType.FILE);
//				String dest = System.getProperty("user.dir") + "./cucumber-Report/screenshots/" + screenshotName
//						+ ".png";
//				File destinationPath = new File(dest);
//				FileUtils.copyFile(sourcePath, destinationPath);
//				Reporter.addScreenCaptureFromPath(destinationPath.toString());
//			} catch (IOException e) {
//			}
//		}
	}

	@After(order = 0)
	public void tearDown() throws InterruptedException {

		Thread.sleep(1000);
		DriverFactory.quitDriver();

	}

}
