package stepDefinitionsCareers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import careerspageObjects.CareersMeetUs;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinitions.AbstractPageStepDefinition;

public class SD_Careers_MeetUs extends AbstractPageStepDefinition {
	WebDriver driver = getDriver();
	CareersMeetUs careersMeetUs;
	
	@Given("^clicking in the Events keyword searchbox$")
	public void clicking_in_the_Events_keyword_searchbox() throws Throwable {
		careersMeetUs = new CareersMeetUs(driver);
		careersMeetUs.clickKeywordSearchTerm();
	}

	@When("^typing \"([^\"]*)\" into the Events keyword searchbox$")
	public void typing_into_the_Events_keyword_searchbox(String keyword) throws Exception {
		careersMeetUs = new CareersMeetUs(driver);		
		careersMeetUs.enterTextIntoKeywordSearch(keyword);
	}

	@Then("^articles matching the search term will be displayed in the Events searchbox$")
	public void articles_matching_the_search_term_will_be_displayed_in_the_Events_searchbox() throws Throwable {

	}
	
	@When("^selecting \"([^\"]*)\" from the Location drop down selector$")
	public void selecting_from_the_Location_drop_down_selector(String arg1) throws Throwable {

	}

	@When("^selecting \"([^\"]*)\" from the Sort By drop down selector$")
	public void selecting_from_the_Sort_By_drop_down_selector(String selection) throws Throwable {
		careersMeetUs = new CareersMeetUs(driver);	
		if (selection.equals("Sort A-Z")){
			careersMeetUs.clickSortByAsc();
		}
		else if (selection.equals("Sort Z-A")){
			careersMeetUs.clickSortByDesc();
		}
		else{
			System.out.println("Throws exception");
		}
	}
	

	
	
	
}
