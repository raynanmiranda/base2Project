package utils;

import java.io.File;
import java.io.IOException;

import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class extentReport {

	public static ExtentHtmlReporter htmlextent = null;
	public static ExtentReports report = null;
	public static ExtentTest log = null;
	
	@BeforeClass
	public void exReport() {
		
	htmlextent = new ExtentHtmlReporter("./cucumber-Report/reportProject.html");
	report = new ExtentReports();
	report.attachReporter(htmlextent);
	
	}
	
	public void captureScreen() throws IOException {
		File sourcePath = ((TakesScreenshot) DriverFactory.getInstance()).getScreenshotAs(OutputType.FILE);
		File destinationPath = new File(System.getProperty("user.dir") + "./cucumber-Report/screenshots/" + getcurrentdateandtime() + ".png");
		//copyFile(sourcePath, destinationPath);
		log.addScreenCaptureFromPath("./screenshots/"+getcurrentdateandtime()+".png");
		
//		TakesScreenshot screen = (TakesScreenshot) DriverFactory.getInstance();
//		File src = screen.getScreenshotAs(OutputType.FILE);
//		String dest ="./cucumber-Report/screenshots/"+getcurrentdateandtime()+".png";
//		File target = new File(dest);
//		FileUtils.copyFile(src, target);
//		return dest;
	}
	public String getcurrentdateandtime(){
		String str = null;
		try{
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
		Date date = new Date();
		str= dateFormat.format(date);
		str = str.replace(" ", "").replaceAll("/", "").replaceAll(":", "");
		}
		catch(Exception e){

		}
		return str;
		}
	
}
	
