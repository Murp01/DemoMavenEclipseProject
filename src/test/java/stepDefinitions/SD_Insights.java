package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.InsightsPage;

public class SD_Insights extends AbstractPageStepDefinition {
	//private static WebDriver driver;
	WebDriver driver = getDriver();
	InsightsPage insightsPage;

	@When("^the user enters a search term into the Insights Keywords field$")
	public void the_user_enters_a_search_term_into_the_Insights_Keywords_field() throws Throwable {
		insightsPage = new InsightsPage(driver);
		insightsPage.clickClearInsightKeywordBox();
		insightsPage.insight_KeywordEnterText("Paul");	
	}
	
	@When("^filtered Insights articles appear$")
	public void filtered_Insights_articles_appear() throws Throwable {
		insightsPage = new InsightsPage(driver);
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
