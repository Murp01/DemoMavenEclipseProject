package stepDefinitionsCareers;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import stepDefinitions.AbstractPageStepDefinition;

public class SD_Careers_Common extends AbstractPageStepDefinition {
	WebDriver driver = getDriver();
	
	@Given("^selects \"([^\"]*)\" from the location selector at the top-right of the header banner$")
	public void selects_from_the_location_selector_at_the_top_right_of_the_header_banner(String arg1) throws Throwable {

	}
	
	@Given("^\"([^\"]*)\" will be displayed in the header banner next to the search icon$")
	public void will_be_displayed_in_the_header_banner_next_to_the_search_icon(String arg1) throws Throwable {

	}
	


	@When("^the user clicks on the \"([^\"]*)\" filter$")
	public void the_user_clicks_on_the_filter(String arg1) throws Throwable {

	}

	@When("^the Social wall displays only \"([^\"]*)\" content\\.$")
	public void the_Social_wall_displays_only_content(String arg1) throws Throwable {

	}

	@When("^the user clicks on one of the \"([^\"]*)\" tiles$")
	public void the_user_clicks_on_one_of_the_tiles(String arg1) throws Throwable {

	}
}
