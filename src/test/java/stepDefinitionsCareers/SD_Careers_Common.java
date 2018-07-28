package stepDefinitionsCareers;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import careerspageObjects.CareersCommon;
import careerspageObjects.CareersOurOpportunities;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinitions.AbstractPageStepDefinition;

public class SD_Careers_Common extends AbstractPageStepDefinition {
	WebDriver driver = getDriver();
	SD_Careers_EarlyCareers sdCareersEarlyCareers;
	CareersCommon careersCommon;
	CareersOurOpportunities careersOurOpportunities;

	@Then("^assert \"([^\"]*)\" secondary navigation is displayed$")
	public void assert_secondary_navigation_is_displayed(String title) throws Throwable {
		careersCommon = new CareersCommon(driver);
		switch(title) {
		case "Title01":
			//needs another assert for titles
			careersCommon.assertSecNavActive();
			break;
		case "Title02":
			careersCommon.assertSecNavActive();
			break;
		case "Title03":
			careersCommon.assertSecNavActive();
			break;
		}
	}	
		
	@When("^clicking on the Linklaters home button$")
	public void clicking_on_the_Linklaters_home_button() throws Throwable { 
		careersCommon = new CareersCommon(driver);
		careersCommon.clickLlHomeButton();
	}	
	
	//add assertions from separate method
	@Given("^clicking on \"([^\"]*)\" from \"([^\"]*)\"$")
	public void clicking_on_from(String secNav, String titNav) throws Throwable {
		switch(titNav){
		case "Title01":
			switch(secNav){
			case "Our opportunities":				
				careersCommon = new CareersCommon(driver);				
				careersCommon.mouseOverPrimeNavOne();
				careersCommon.clickSecOurOpportunites();
				careersOurOpportunities = new CareersOurOpportunities(driver);
				careersOurOpportunities.assertBreadCrumbOurOpportunities();
				break;
			case "Our people":
				careersCommon = new CareersCommon(driver);
				careersCommon.mouseOverPrimeNavOne();
				careersCommon.clickSecOurPeople();			
				break;
			case "Meet Us":
				careersCommon = new CareersCommon(driver);				
				careersCommon.mouseOverPrimeNavOne();
				careersCommon.clickSecMeetUs();
				break;
			case "Our Work":
				careersCommon = new CareersCommon(driver);
				careersCommon.mouseOverPrimeNavOne();
				careersCommon.clickSecOurWork();
				break;
			case "Your Career":
				careersCommon = new CareersCommon(driver);
				careersCommon.mouseOverPrimeNavOne();
				careersCommon.clickSecYourCareer();
				break;
			case "Your Application":
				careersCommon = new CareersCommon(driver);
				careersCommon.mouseOverPrimeNavOne();
				careersCommon.clickSecYourApplication();
				break;
			case "Our Deals":
				careersCommon = new CareersCommon(driver);
				careersCommon.mouseOverPrimeNavOne();
				careersCommon.clickSecOurDeals();
				break;
			case "Why Join":
				careersCommon = new CareersCommon(driver);
				careersCommon.mouseOverPrimeNavOne();
				careersCommon.clickSecWhyJoin();
				break;
			case "Who we are":
				careersCommon = new CareersCommon(driver);
				careersCommon.mouseOverPrimeNavOne();
				careersCommon.clickSecWhoWeAre();
				break;
			case "Commercial Awareness":
				careersCommon = new CareersCommon(driver);
				careersCommon.mouseOverPrimeNavOne();
				careersCommon.clickSecCommercialAwareness();
				break;
			}
		}
	}
	
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
	
	@Given("^mouse over \"([^\"]*)\" from the primary navigation header$")
	public void mouse_over_from_the_primary_navigation_header(String title) throws Throwable {
		careersCommon = new CareersCommon(driver);
		switch(title) {
		case "Title01":
			careersCommon.mouseOverPrimeNavOne();
			break;
		case "Title02":
			careersCommon.mouseOverPrimeNavTwo();
			break;
		case "Title03":
			careersCommon.mouseOverPrimeNavThree();
			break;
		}

	}
	
	@Given("^the cookies are cleared$")
	public void the_cookies_are_cleared() throws Throwable {
		System.out.println("The cookies are cleared placeholder and close cookie banner");
	}	
	
	@Given("^the user is on the Careers homepage$")
	public void the_user_is_on_the_Careers_homepage() throws Throwable {		
		driver.get("https://careers.linklaters.com/");
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
	
	@Then("^\"([^\"]*)\" careers page is open$")
	public void careers_page_is_open(String link) throws Throwable {
		careersCommon = new CareersCommon(driver);
		switch(link) {
		case "Title01":
			sdCareersEarlyCareers.assertTitle01();
			break;
		case "Title02":
			careersCommon.assertTitle02();
			break;
		case "Title03":
			careersCommon.assertTitle03();
			break;
		}
	}
	
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
	
	
}
