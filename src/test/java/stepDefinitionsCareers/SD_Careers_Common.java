package stepDefinitionsCareers;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import careerspageObjects.CareersCommon;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import stepDefinitions.AbstractPageStepDefinition;

public class SD_Careers_Common extends AbstractPageStepDefinition {
	WebDriver driver = getDriver();
	CareersCommon careersCommon;
	
	@Given("^clicking on \"([^\"]*)\" from \"([^\"]*)\"$")
	public void clicking_on_from(String secNav, String titNav) throws Throwable {
		switch(titNav){
		case "Title01":
			switch(secNav){
			case "Our opportunities":				
				Actions action = new Actions(driver);	
				action.moveToElement(driver.findElement(By.xpath("//div[@class='header__navDesktop']/ul/li/a[@href='/en/early-careers']"))).build().perform();
				WebDriverWait wait = new WebDriverWait(driver, 15);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/en/early-careers/our-opportunities']")));
				driver.findElement(By.xpath("//a[@href='/en/early-careers/our-opportunities']")).click();			
				break;
			case "Our people":
				//driver.findElement(By.xpath("//div[@class='header__navDesktop']/ul/li/a[@href='/en/experienced-lawyers']")).click();
				break;
			}
		}
	}

		
	@Given("^the browser is set up$")
	public void the_browser_is_set_up() throws Throwable {
		System.out.println("Browser set up placeholder");
	}

	@Given("^the cookies are cleared$")
	public void the_cookies_are_cleared() throws Throwable {
		System.out.println("The cookies are cleared placeholder and close cookie banner");
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
	
	//Linklaters home button
	
	@When("^clicking on the Linklaters home button$")
	public void clicking_on_the_Linklaters_home_button() throws Throwable { 
		careersCommon = new CareersCommon(driver);
		careersCommon.clickLlHomeButton();
	}	
	
	//Language Selector
	
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
	
	@Then("^the \"([^\"]*)\" version of the site will be opened$")
	public void the_version_of_the_site_will_be_opened(String link) throws Throwable {
		careersCommon = new CareersCommon(driver);
		switch(link) {
		case "Location01":
			careersCommon.assertGeoSel01();
			break;
		case "Location02":
			careersCommon.assertGeoSel02();
			break;
		case "Location03":
			careersCommon.assertGeoSel03();
			break;
		}
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
