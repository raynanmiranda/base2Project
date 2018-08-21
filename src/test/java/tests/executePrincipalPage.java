package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				 features = {"src/test/java/features/PrincipalMantisPage.feature"}, 
				     glue = {"steps","hook"}
				     
				)


public class ExecutePrincipalPage {

}
