package stepDefinitionsCareers;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import careerspageObjects.CareersOurOpportunities;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinitions.AbstractPageStepDefinition;

public class SD_Careers_OurOpportunities extends AbstractPageStepDefinition{
	WebDriver driver = getDriver();
	CareersOurOpportunities careersOurOpportunities;
	
	@When("^clicking on the \"([^\"]*)\" tab of the accordion widget$")
	public void clicking_on_the_tab_of_the_accordion_widget(String link) throws Throwable {
		careersOurOpportunities = new CareersOurOpportunities(driver);
		switch(link){
		case "first":
			careersOurOpportunities.ClickAccordion01();
			break;
		case "second":
			careersOurOpportunities.ClickAccordion02();
			break;
		}
	}

	@Then("^the contents of the \"([^\"]*)\" tab will be displayed below$")
	public void the_contents_of_the_tab_will_be_displayed_below(String link) throws Throwable {
		careersOurOpportunities = new CareersOurOpportunities(driver);
		switch(link){
		case "first":
			careersOurOpportunities.AssertAccordion01Paragraph();
			break;
		case "second":
			break;
		}

	}
	
	@Then("^the contents of the \"([^\"]*)\" tab will be hidden$")
	public void the_contents_of_the_tab_will_be_hidden(String arg1) throws Throwable {

		
	}


}
