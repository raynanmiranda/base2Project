package tests;

import org.junit.runner.RunWith;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				 features = {"src/test/java/features/Projects.feature"}, 
				 plugin = {"pretty","html:target/cucumber-report" },    
				 glue = {"steps","hoks"},
				     tags = "@CreateNewUserOnManageUsers" //"@CreateNewProject"
				     
				)

public class executeProjects extends AbstractTestNGCucumberTests{

	
}
