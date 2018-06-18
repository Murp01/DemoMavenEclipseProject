package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.InsightsPage;

public class Steps extends AbstractPageStepDefinition{
	//private static WebDriver driver;
	WebDriver driver = getDriver();
	InsightsPage insightsPage;
	
	@Given("^the user is on the homepage$")
	public void the_user_is_on_the_homepage() throws Throwable {
		//driver = new FirefoxDriver();		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		driver.get("https://www.linklaters.com/");
	}

	@Given("^clicks on Insights on the title header$")
	public void clicks_on_Insights_on_the_title_header() throws Throwable {
		driver.findElement(By.xpath("/html/body/header/div/div/div/ul/li[6]/a")).click();
	}



	@When("^filtered Insights articles appear$")
	public void filtered_Insights_articles_appear() throws Throwable {
		
	}

	@When("^clicks Read More on Insights article$")
	public void clicks_Read_More_on_Insights_article() throws Throwable {
		System.out.println("Hello click on Read More");
	}

	@Then("^Insight article detail page opens$")
	public void insight_article_detail_page_opens() throws Throwable {
		System.out.println("Hello Articles detail page");
		//driver.quit();
	}
	

}
