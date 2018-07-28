package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.InsightsPagePOM;

public class SD_Insights extends AbstractPageStepDefinition {
	//private static WebDriver driver;
	WebDriver driver = getDriver();
	InsightsPagePOM insightsPage;
	
	@Given("^asserts the Insights page is open$")
	public void asserts_the_Insights_page_is_open() throws Throwable {
		WebDriverWait  wait =new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.urlMatches("https://www.linklaters.com/en/insights"));
		wait.until(ExpectedConditions.titleIs("Insights | Linklaters"));
	}

	@When("^the user enters a search term into the Insights Keywords field$")
	public void the_user_enters_a_search_term_into_the_Insights_Keywords_field() throws Throwable {
		insightsPage = new InsightsPagePOM(driver);
		insightsPage.clickClearInsightKeywordBox();
		insightsPage.insight_KeywordEnterText("Paul");	
	}
	
	@When("^filtered Insights articles appear$")
	public void filtered_Insights_articles_appear() throws Throwable {
		insightsPage = new InsightsPagePOM(driver);
		//insightsPage.insight_eventsSearchResults();
		System.out.println("Filtered article appears");
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
