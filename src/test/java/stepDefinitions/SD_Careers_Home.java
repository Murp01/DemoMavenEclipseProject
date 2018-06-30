package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SD_Careers_Home extends AbstractPageStepDefinition{
	WebDriver driver = getDriver();

	
	
	@When("^clicks on the Early Careers title in the primary navigation$")
	public void clicks_on_the_Early_Careers_title_in_the_primary_navigation() throws Throwable {
		driver.findElement(By.xpath("//div[@class='header__navDesktop']/ul/li/a[@href='/en/early-careers']")).click();
	}
	
	@Given("^asserts the UK Careers microsite homepage is open$")
	public void asserts_the_UK_Careers_microsite_homepage_is_open() throws Throwable {

	}
	
	
	
	
	
	
	
	
	
	
}
