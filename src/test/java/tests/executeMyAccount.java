package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				 features = {"src/test/java/features/MyAccount.feature"}, 
				     glue = {"steps","hoks"}
				     //tags = {"@PreferencesTag"}
				)
public class executeMyAccount {

}