package tests;

import java.io.File;
import org.junit.AfterClass;

import org.junit.runner.RunWith;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
				 features = {"src/test/java/features/Projects.feature"},     
				 plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:cucumber-Report/reportBase2Project.html"},    
				   glue = {"steps","hook"}
				   //tags = {"@EditTask"}
				     
				)

public class ExecuteProjectsTest {

	
	
	
	@AfterClass
	public static void teardown() {

		
		Reporter.loadXMLConfig(new File("src/test/java/utils/extent-Config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows 10");
		Reporter.setTestRunnerOutput("test runner output message Project");
		
	}
}
