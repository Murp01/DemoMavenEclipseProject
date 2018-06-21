package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Common;
import pageObjects.InsightsPage;

public class SD_Common extends AbstractPageStepDefinition{
	
	WebDriver driver = getDriver();
	Common common; 
	
	@Given("^clicks on Insights on the title header$")
	public void clicks_on_Insights_on_the_title_header() throws Throwable {
		common = new Common(driver);
		common.insightTitleClick();
	}
	
	@Given("^hovers over the Insights title$")
	public void hovers_over_the_Insights_title() throws Throwable {
	    Actions builder = new Actions(driver);
	    builder.moveToElement(driver.findElement(By.xpath("/html/body/header/div/div/div/ul/li[6]/a"))).build().perform();
	}
	
	@Given("^clicks on the Blogs link from the secondary navigation$")
	public void clicks_on_the_Blogs_link_from_the_secondary_navigation() throws Throwable {

	}
	
	@Given("^clicks on the search icon$")
	public void clicks_on_the_search_icon() throws Throwable {
		driver.findElement(By.xpath("header__searchToggle")).click();
	}
	
	@Given("^the search box will open$")
	public void the_search_box_will_open() throws Throwable {
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='header__searchInput']"));
		Assert.assertTrue("SearchBox opened", searchBox.isDisplayed());
	}
	
	@When("^clicks on the \"([^\"]*)\" link in the primary navigation$")
	public void clicking_on_the_link_in_the_primary_navigation(String link) throws Throwable {
		switch(link) {
		case "About Us":
			driver.findElement(By.xpath("//a[@href='/en/about-us'][1]")).click();
			break;
		case "Client Services":
			driver.findElement(By.xpath("//a[@href='/en/client-services'][1]")).click();
			break;
		case "Sectors":
			driver.findElement(By.xpath("//a[@href='/en/sectors'][1]")).click();
			break;
		case "Find a Lawyer":
			driver.findElement(By.xpath("//a[@href='/en/find-a-lawyer'][1]")).click();
			break;
		case "Locations":
			driver.findElement(By.xpath("//a[@href='/en/locations'][1]")).click();
			break;
		case "Insights":
			driver.findElement(By.xpath("//a[@href='/en/insights'][1]")).click();
			break;
		case "Careers":
			driver.findElement(By.xpath("//a[@href='/en/careers'][1]")).click();
			break;	
		}
	}
	
	@Then("^Assert that the url contains \"([^\"]*)\"$")
	public void assert_that_the_url_contains(String title) throws Throwable {
		Assert.assertTrue(driver.getTitle().contains(title));
	}

}