package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;

public class SD_Common extends AbstractPageStepDefinition{
	
	WebDriver driver = getDriver();
	
	@Given("^clicks on Insights on the title header$")
	public void clicks_on_Insights_on_the_title_header() throws Throwable {
		driver.findElement(By.xpath("/html/body/header/div/div/div/ul/li[6]/a")).click();
	}

}
