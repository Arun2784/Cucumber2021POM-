package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/features/loginPage.feature"},
		glue = {"stepdefinitions","AppHooks"},
		plugin = {"pretty"}
		
		
		
		)

public class MyTestRunner {

}
