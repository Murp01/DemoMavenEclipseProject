package stepDefinitionsCareers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinitions.AbstractPageStepDefinition;

public class SD_Careers_Home extends AbstractPageStepDefinition{
	WebDriver driver = getDriver();

	
	
	@When("^clicks on the Early Careers title in the primary navigation$")
	public void clicks_on_the_Early_Careers_title_in_the_primary_navigation() throws Throwable {
		driver.findElement(By.xpath("//div[@class='header__navDesktop']/ul/li/a[@href='/en/early-careers']")).click();
	}
	
	@Given("^asserts the UK Careers microsite homepage is open$")
	public void asserts_the_UK_Careers_microsite_homepage_is_open() throws Throwable {
		WebDriverWait wait =new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.urlMatches("https://careers.linklaters.com/"));
		wait.until(ExpectedConditions.titleIs("Linklaters Careers | Home"));
	}
	
	@Given("^the user is on the Careers homepage$")
	public void the_user_is_on_the_Careers_homepage() throws Throwable {

	}
	
	@Given("^the \"([^\"]*)\" Social Wall will be displayed with default filters set$")
	public void the_Social_Wall_will_be_displayed_with_default_filters_set(String arg1) throws Throwable {

	}
	
	@When("^clicking on one of the \"([^\"]*)\" tiles$")
	public void clicking_on_one_of_the_tiles(String arg1) throws Throwable {

	}

	@Given("^there are more than ten tiles on the wall$")
	public void there_are_more_than_ten_tiles_on_the_wall() throws Throwable {

	}

	@When("^clicking on the Load More button$")
	public void clicking_on_the_Load_More_button() throws Throwable {

	}

	@Then("^ten more tiles will appear$")
	public void ten_more_tiles_will_appear() throws Throwable {

	}
	
	
	
}
