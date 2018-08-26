package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AboutUsPOM;
import pageObjects.CommonPOM;

public class SD_AboutUs extends AbstractPageStepDefinition{
	WebDriver driver = getDriver();
	CommonPOM commonPOM; 
	AboutUsPOM aboutUsPOM;
	
	
	@Then("^asserts the accordion module is located on the page$")
	public void asserts_the_accordion_module_is_located_on_the_page() throws Throwable {
		aboutUsPOM = new AboutUsPOM(driver);
		aboutUsPOM.assertAccordionModule();
	}
	
	@Given("^asserts people widget is visible on the page$")
	public void asserts_people_widget_is_visible_on_the_page() throws Throwable {
		aboutUsPOM = new AboutUsPOM(driver);
		aboutUsPOM.assertPeopleModuleContainer();		
	}
	
	@Then("^asserts \"([^\"]*)\" accordion content is visible$")
	public void asserts_accordion_content_is_visible(String content) throws Throwable {
		aboutUsPOM = new AboutUsPOM(driver);
		switch(content){
		case "Tab01":
			aboutUsPOM.assertAccordionContent01Displayed();
			break;
		case "Tab02":
			aboutUsPOM.assertAccordionContent02Displayed();
			break;
		case "Tab03":
			aboutUsPOM.assertAccordionContent03Displayed();
			break;
		}
	}
	
	@Then("^asserts \"([^\"]*)\" accodion content is hidden$")
	public void asserts_accodion_content_is_hidden(String content) throws Throwable {
		aboutUsPOM = new AboutUsPOM(driver);
		switch(content){
		case "Tab01":
			aboutUsPOM.assertAccordionContent01IsHidden();
			break;
		case "Tab02":

			break;
		case "Tab03":

			break;
		}
	}
	
	@Given("^clicks on the \"([^\"]*)\" characters profile$")
	public void clicks_on_the_characters_profile(String profile) throws Throwable {
		aboutUsPOM = new AboutUsPOM(driver);
		switch(profile){
		case "first":
			aboutUsPOM.assertPersonProfileName01();			
			break;
		case "second":
			aboutUsPOM.assertPersonProfileName02();
			break;
		}	
	}
	
	@Then("^clicks on \"([^\"]*)\" of the accordion module$")
	public void clicks_on_of_the_accordion_module(String tab) throws Throwable {
		aboutUsPOM = new AboutUsPOM(driver);
		switch(tab){
		case "Tab01":
			aboutUsPOM.clickAccordionTab01();
			break;
		case "Tab02":
			aboutUsPOM.clickAccordionTab02();
			break;
		case "Tab03":
			aboutUsPOM.clickAccordionTab03();
			break;
		}	
	}
	



}
