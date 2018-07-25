package stepDefinitionsCareers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinitions.AbstractPageStepDefinition;

public class SD_Careers_MeetUs extends AbstractPageStepDefinition {
	WebDriver driver = getDriver();
	
	@Given("^clicking in the Events keyword searchbox$")
	public void clicking_in_the_Events_keyword_searchbox() throws Throwable {
		
	}

	@When("^typing \"([^\"]*)\" into the Events keyword searchbox$")
	public void typing_into_the_Events_keyword_searchbox(String keyword) throws Throwable {
		
	}

	@Then("^articles matching the search term will be displayed in the Events searchbox$")
	public void articles_matching_the_search_term_will_be_displayed_in_the_Events_searchbox() throws Throwable {

	}
	

	
	
	
}
