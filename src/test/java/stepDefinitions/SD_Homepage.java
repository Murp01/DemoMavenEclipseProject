package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;

public class SD_Homepage extends AbstractPageStepDefinition {
	
	WebDriver driver = getDriver();
	
	@Given("^the user is on the homepage$")
	public void the_user_is_on_the_homepage() throws Throwable {
		//driver = new FirefoxDriver();		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		driver.get("https://www.linklaters.com/");
	}
	
	


}
