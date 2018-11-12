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
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Log;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import hook.HookSteps;


public class getScreenShot {

	
	
	public static String captureScreen() throws IOException {
		File sourcePath = ((TakesScreenshot) DriverFactory.getInstance()).getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "./cucumber-Report/screenshots/" + getcurrentdateandtime() + ".png";
		File destinationPath = new File(dest);
		FileUtils.copyFile(sourcePath, destinationPath);
		
		return dest;
	}
	
	public static String getcurrentdateandtime(){
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
	
//	public void getResult(ITestResult result)  throws IOException{
//		
//		if(result.getStatus()== ITestResult.SUCCESS) {
//			String screen = captureScreen();
//			HookSteps.log.log(Status.PASS, ""+ HookSteps.log.addScreenCaptureFromPath(screen));
//			HookSteps.log.log(Status.PASS, result.getName()+"Test Passed Successfully");
//		}
//		else if(result.getStatus()== ITestResult.SKIP) {
//			HookSteps.log.log(Status.SKIP, result.getName()+"Test Skipped duo to: "+ result.getThrowable());
//		}
//		else if(result.getStatus()== ITestResult.FAILURE) {
//			HookSteps.log.log(Status.FAIL, result.getName()+"Test is Failed"+ result.getThrowable());
//			String screen = captureScreen();
//			HookSteps.log.log(Status.FAIL, ""+ HookSteps.log.addScreenCaptureFromPath(screen));
//		}
//		else if(result.getStatus()== ITestResult.STARTED) {
//			HookSteps.log.log(Status.INFO, result.getName()+"Test has Started");
//		}
		
		
//	}
	
	
}
	
