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
	
	@Then("^Assert that the url contains \"([^\"]*)\"$")
	public void assert_that_the_url_contains(String title) throws Throwable {
		Assert.assertTrue(driver.getTitle().contains(title));
	}	
	
	@Given("^clicks on the Blogs link from the secondary navigation$")
	public void clicks_on_the_Blogs_link_from_the_secondary_navigation() throws Throwable {

	}
	
	@Given("^clicks the close button on the cookie banner$")
	public void clicks_the_close_button_on_the_cookie_banner() throws Throwable {
		common = new Common(driver);
		common.cookieBannerCloseBtn();
	}
	
	@Given("^clicks on Insights on the title header$")
	public void clicks_on_Insights_on_the_title_header() throws Throwable {
		common = new Common(driver);
		common.insightTitleClick();
	}
	
	@Given("^hovers over the About Us title and selects \"([^\"]*)\"$")
	public void hovers_over_the_About_Us_title_and_selects(String link) throws Throwable {
		switch(link) {
		case "Alumni":
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//div[@class='header__navDesktop']/ul/li/a[@href='/en/about-us']"))).click().build().perform();
			driver.findElement(By.xpath("//li/a[@href='/en/about-us/alumni']")).click();  //not finding correct link
			break;
		case "At a glance":
			driver.findElement(By.xpath("//a[@href='/en/client-services'][1]")).click();
			break;
		case "Contact Us":
			driver.findElement(By.xpath("//a[@href='/en/sectors'][1]")).click();
			break;
		case "Executive Committee":
			driver.findElement(By.xpath("//a[@href='/en/find-a-lawyer'][1]")).click();
			break;
		case "Innovation":
			driver.findElement(By.xpath("//a[@href='/en/locations'][1]")).click();
			break;
		case "News and Deals":
			driver.findElement(By.xpath("//a[@href='/en/insights'][1]")).click();
			break;
		case "Responsibility":
			driver.findElement(By.xpath("//a[@href='/en/careers'][1]")).click();
			break;	
		}
	}
	
	@Given("^clicks on the Linklaters logo$")
	public void clicks_on_the_Linklaters_logo() throws Throwable {

	}
	
	@Given("^clicks on the search toggle$")
	public void clicks_on_the_search_icon() throws Throwable {
		common = new Common(driver);
		common.searchToggleClick();
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
	
	@Given("^the cookie policy banner appears$")
	public void the_cookie_policy_banner_appears() throws Throwable {
		common = new Common(driver);
		common.cookieBannerAssertTrue();
	}
	
	@Given("^hovers over the Insights title$")
	public void hovers_over_the_Insights_title() throws Throwable {
		common = new Common(driver);
	    common.insightTitleHover();
	}
	
	@Given("^hovers over the insights title and selects publications$")
	public void hovers_over_the_insights_title_and_selects_publications() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html/body/header/div/div/div/ul/li[6]/a"))).click().build().perform();
		driver.findElement(By.xpath("/html/body/nav/div/div[6]/ul[3]/li/a")).click();
	}
	
	@Then("^the cookie policy banner will not be displayed$")
	public void the_cookie_policy_banner_will_not_be_displayed() throws Throwable {

	}
	
	@Given("^the search input will not be open$")
	public void the_search_box_will_not_be_open() throws Throwable {
		common = new Common(driver);
		common.searchInputAssertFalse();
	}
	
	@Given("^the search input will open$")
	public void the_search_box_will_open() throws Throwable {
		common = new Common(driver);
		common.searchInputAssertTrue();
	}


}
