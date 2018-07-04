package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Common;

public class SD_AboutUs extends AbstractPageStepDefinition{
	WebDriver driver = getDriver();
	Common common; 
	
/*	@Given("^locates the accordian widget$")
	public void locates_the_accordian_widget() throws Throwable {
		Assert.assertTrue("Accordian found on page.", driver.findElement(By.xpath("//div[@class='accordionGeneral ui-accordion ui-widget ui-helper-reset']/h2[1]")).isDisplayed());
		//Where is message?
	}*/
	
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
