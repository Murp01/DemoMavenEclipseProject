package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import pageObjects.PeopleDetailsPOM;

public class SD_PeopleDetails extends AbstractPageStepDefinition{
	WebDriver driver = getDriver();
	PeopleDetailsPOM peopleDetailsPOM;
	
	@Then("^asserts the correct persons details page opens$")
	public void asserts_the_correct_persons_details_page_opens() throws Throwable {
		peopleDetailsPOM = new PeopleDetailsPOM(driver);
		peopleDetailsPOM.assertCorrectPeopleDetailsPageOpens();
	}


}
