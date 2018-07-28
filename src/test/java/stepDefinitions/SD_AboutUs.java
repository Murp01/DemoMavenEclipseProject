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
	
	@Then("^asserts \"([^\"]*)\" accordion content is visible$")
	public void asserts_accordion_content_is_visible(String content) throws Throwable {
		aboutUsPOM = new AboutUsPOM(driver);
		switch(content){
		case "Tab01":
			aboutUsPOM.assertAccordionContent01Displayed();
			break;
		case "Tab02":

			break;
		case "Tab03":

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

	
	@Then("^the \"([^\"]*)\" topic will open$")
	public void the_topic_will_open(String link) throws Throwable {
		switch(link) {
		case "first":
			Assert.assertTrue("First topic is open", driver.findElement(By.xpath("[1]")).isDisplayed());
			break;
		case "second":
			Assert.assertTrue("Second topic is open.", driver.findElement(By.xpath("[2]")).isDisplayed());
			break;
		case "third":
			Assert.assertTrue("Third topic is open", driver.findElement(By.xpath("[3]")).isDisplayed());
			break;
		case "fourth":
			Assert.assertTrue("Fourth topic is open", driver.findElement(By.xpath("[4]")).isDisplayed());
			break;
		case "fifth":
			Assert.assertTrue("Fifth topic is open", driver.findElement(By.xpath("[5]")).isDisplayed());
			break;
		case "sixth":
			Assert.assertTrue("Sixth topic is open", driver.findElement(By.xpath("[6]")).isDisplayed());
			break;
		case "seventh":
			Assert.assertTrue("Seventh topic is open", driver.findElement(By.xpath("[7]")).isDisplayed());
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
	
	@When("^clicking on the \"([^\"]*)\" topic$")
	public void clicking_on_the_link_in_the_primary_navigation(String link) throws Throwable {
		switch(link) {
		case "first":
			driver.findElement(By.xpath("//div[@class='accordionGeneral ui-accordion ui-widget ui-helper-reset']/h2[1]")).click();
			break;
		case "second":
			driver.findElement(By.xpath("//div[@class='accordionGeneral ui-accordion ui-widget ui-helper-reset']/h2[2]")).click();
			break;
		case "third":
			driver.findElement(By.xpath("//div[@class='accordionGeneral ui-accordion ui-widget ui-helper-reset']/h2[3]")).click();
			break;
		case "fourth":
			driver.findElement(By.xpath("//div[@class='accordionGeneral ui-accordion ui-widget ui-helper-reset']/h2[4]")).click();
			break;
		case "fifth":
			driver.findElement(By.xpath("//div[@class='accordionGeneral ui-accordion ui-widget ui-helper-reset']/h2[5]")).click();
			break;
		case "sixth":
			driver.findElement(By.xpath("//div[@class='accordionGeneral ui-accordion ui-widget ui-helper-reset']/h2[6]")).click();
			break;
		case "seventh":
			driver.findElement(By.xpath("//div[@class='accordionGeneral ui-accordion ui-widget ui-helper-reset']/h2[7]")).click();
			break;	
		}
	}

	@Then("^the \"([^\"]*)\" topic will close$")
	public void the_topic_will_close(String arg1) throws Throwable {

	}

}
