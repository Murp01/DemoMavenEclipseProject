package stepDefinitionsCareers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import stepDefinitions.AbstractPageStepDefinition;

public class SD_Careers_Hooks extends AbstractPageStepDefinition {
	WebDriver driver = getDriver();
	
	@Before
	public void testSetUp() {
		driver.manage().window().maximize();
	}
	
/*	@After
	public void testTearDown() {
		driver.close();
	}*/

}
