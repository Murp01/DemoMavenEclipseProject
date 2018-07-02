package stepDefinitionsCareers;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinitions.AbstractPageStepDefinition;

public class SD_Careers_DetailsPages extends AbstractPageStepDefinition{
	WebDriver driver = getDriver();
	
	@Then("^a \"([^\"]*)\" details page will open$")
	public void a_details_page_will_open(String arg1) throws Throwable {

	}
	
	@When("^the user clicks on the 'Return' CTA at the bottom of the page$")
	public void the_user_clicks_on_the_Return_CTA_at_the_bottom_of_the_page() throws Throwable {

	}
	
	@Then("^a webpage will open on the twitter feed page$")
	public void a_webpage_will_open_on_the_twitter_feed_page() throws Throwable {

	}

}
