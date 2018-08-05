package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				 features = {"src/test/java/features/Projects.feature"}, 
				     glue = {"steps","hoks"}
				     //tags = {"@CreateNewProject","@EntryOfManageProject"}
				     
				)

public class executeProjects {

}
