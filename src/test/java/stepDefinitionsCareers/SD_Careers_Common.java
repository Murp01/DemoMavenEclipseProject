package stepDefinitionsCareers;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import careerspageObjects.CareersCommon;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import stepDefinitions.AbstractPageStepDefinition;

public class SD_Careers_Common extends AbstractPageStepDefinition {
	WebDriver driver = getDriver();
	CareersCommon careersCommon;
	
	@When("^\"([^\"]*)\" is selected from the location select drop down box$")
	public void is_selected_from_the_location_select_drop_down_box(String link) throws Throwable {
		careersCommon = new CareersCommon(driver);
		switch(link) { //20 locations
		case "Location01":
			careersCommon.mouseOverGeoToggle();
			careersCommon.clickOnGeoSel01();
			break;
		case "Location02":
			careersCommon.mouseOverGeoToggle();
			careersCommon.clickOnGeoSel02();
			break;
		case "Location03":
			careersCommon.mouseOverGeoToggle();
			careersCommon.clickOnGeoSel03();			
			break;
		}
	}
	
	@Given("^\"([^\"]*)\" will be displayed in the header banner next to the search icon$")
	public void will_be_displayed_in_the_header_banner_next_to_the_search_icon(String link) throws Throwable {
		careersCommon = new CareersCommon(driver);
		switch(link) {
		case "Location01":
			
			break;
		case "Location02":
			
			break;
		case "Location03":
			
			break;
		}
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
	
	@Given("^the Step by step numbered cards will be displayed$")
	public void the_Step_by_step_numbered_cards_will_be_displayed() throws Throwable {

	}

	@Given("^while on the first tab clicks on the left arrow above the module$")
	public void while_on_the_first_tab_clicks_on_the_left_arrow_above_the_module() throws Throwable {

	}

	@Then("^the last tab will be selected$")
	public void the_last_tab_will_be_selected() throws Throwable {

	}

	@Then("^while on the last tab clicks on the right arrow above the module$")
	public void while_on_the_last_tab_clicks_on_the_right_arrow_above_the_module() throws Throwable {

	}

	@Then("^the first tab will be selected$")
	public void the_first_tab_will_be_selected() throws Throwable {

	}

	@Then("^while on the first tab clicks on the right tab to cycle through all available tabs$")
	public void while_on_the_first_tab_clicks_on_the_right_tab_to_cycle_through_all_available_tabs() throws Throwable {

	}

	@Then("^each tab will be highlighted and all cards will be displayed in the correct order$")
	public void each_tab_will_be_highlighted_and_all_cards_will_be_displayed_in_the_correct_order() throws Throwable {

	}

	@Then("^while on the last tab clicks on the left tab to cycle through all available tabs$")
	public void while_on_the_last_tab_clicks_on_the_left_tab_to_cycle_through_all_available_tabs() throws Throwable {

	}

	@Then("^each tab will be highlighted and all cards will be displayed in the correct orde$")
	public void each_tab_will_be_highlighted_and_all_cards_will_be_displayed_in_the_correct_orde() throws Throwable {

	}
	
	@When("^locating a numbered card with a link within the description$")
	public void locating_a_numbered_card_with_a_link_within_the_description() throws Throwable {

	}

	@When("^clicks on the link$")
	public void clicks_on_the_link() throws Throwable {

	}

	@Then("^the page specified on the link will open$")
	public void the_page_specified_on_the_link_will_open() throws Throwable {

	}
	
	//Primary navigation titles
	
	@When("^clicking on the \"([^\"]*)\" title from the careers primary navigation$")
	public void clicking_on_the_link_in_the_careers_primary_navigation(String link) throws Throwable {
		careersCommon = new CareersCommon(driver);
		switch(link) {
		case "Title01":
			careersCommon.clickTitle01();
			break;
		case "Title02":
			careersCommon.clickTitle02();
			break;
		case "Title03":
			careersCommon.clickTitle03();
			break;
		}
	}	
	
	@Then("^\"([^\"]*)\" careers page is open$")
	public void careers_page_is_open(String link) throws Throwable {
		careersCommon = new CareersCommon(driver);
		switch(link) {
		case "Title01":
			careersCommon.assertTitle01();
			break;
		case "Title02":
			careersCommon.assertTitle02();
			break;
		case "Title03":
			careersCommon.assertTitle03();
			break;
		}
	}
}
