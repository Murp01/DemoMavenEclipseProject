package stepDefinitions;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;

public class SD_Homepage extends AbstractPageStepDefinition {
	
	WebDriver driver = getDriver();
	
	@Given("^the user is on the homepage$")
	public void the_user_is_on_the_homepage() throws Throwable {	
		driver.get("https://www.linklaters.com/");
	}


}
