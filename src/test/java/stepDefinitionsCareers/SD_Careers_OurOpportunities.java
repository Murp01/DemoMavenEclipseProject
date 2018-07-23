package stepDefinitionsCareers;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinitions.AbstractPageStepDefinition;

public class SD_Careers_OurOpportunities extends AbstractPageStepDefinition{
	WebDriver driver = getDriver();
	
	@When("^clicking on the \"([^\"]*)\" tab of the accordion widget$")
	public void clicking_on_the_tab_of_the_accordion_widget(String link) throws Throwable {
		switch(link){
		case "first":
			driver.findElement(By.xpath("//div[@class='accordionGeneral ui-accordion ui-widget ui-helper-reset']/h2[1]")).click();
			break;
		case "second":
			driver.findElement(By.xpath("//div[@class='accordionGeneral ui-accordion ui-widget ui-helper-reset']/h2[2]")).click();
			break;
		}
	}

	@Then("^the contents of the \"([^\"]*)\" tab will be displayed below$")
	public void the_contents_of_the_tab_will_be_displayed_below(String link) throws Throwable {
		switch(link){
		case "first":
			String actualString = driver.findElement(By.xpath("//div[@class='accordionGeneral ui-accordion ui-widget ui-helper-reset']/div/p")).getText();
			System.out.println(actualString);
			Assert.assertFalse(actualString.isEmpty());
			break;
		case "second":
			break;
		}

	}
	
	@Then("^the contents of the \"([^\"]*)\" tab will be hidden$")
	public void the_contents_of_the_tab_will_be_hidden(String arg1) throws Throwable {

		
	}


}
