package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalTests"
		,glue = {"stepDefinitions","stepDefinitionsCareers"}
		,plugin = {"json:target/cucumber-parallel/1.json", "html:target/cucumber-parallel/1.html", "pretty"}
		,monochrome = true
		,tags = {"@Trythis"}
		)

public class TestRunner {
}
