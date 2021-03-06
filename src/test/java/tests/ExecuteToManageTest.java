package tests;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/features/toManage.feature" },
				// plugin = {"pretty","html:target/cucumber-report" },
				   plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:cucumber-Report/reportBase2Project.html" }, 
				     glue = {"steps", "hook" }
				     //tags = { "@DeleteMarker"}

)

public class ExecuteToManageTest {

	@AfterClass
	public static void teardown() {

		Reporter.loadXMLConfig(new File("target/extent-Config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows 10");
		Reporter.setTestRunnerOutput("test runner output message Project");
	}

}
