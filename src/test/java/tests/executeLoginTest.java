package tests;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
				 features = "src/test/java/features/login.feature", 
				     glue = {"steps","hoks"}
				)
		
public class executeLoginTest{
	
}