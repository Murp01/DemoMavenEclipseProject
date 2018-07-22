package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/CareersTests"
		,glue = {"stepDefinitions","stepDefinitionsCareers"}
		,monochrome = true
		,tags = {"@Trythis"}
		)

public class TestRunner {
}
